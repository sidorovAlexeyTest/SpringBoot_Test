package org.sidorov.controller;

import org.sidorov.dao.BookRepository;
import org.sidorov.entity.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository store;

    @GetMapping("/book")
    public List<Book> getAllBook(){
        List<Book> bookList = new ArrayList<>();
        Iterator<Book> itr = store.findAll().iterator();
        for(; itr.hasNext();){
            bookList.add(itr.next());
        }
        return bookList;
    }

    @GetMapping("book/{id}")
    public Book getBook(@PathVariable("id") int id){
        return store.findById(id).get();
    }

    @PostMapping("/book")
    public List<Book> addBook(Book book){
        store.save(book);
        return getAllBook();
    }
}

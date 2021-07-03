package main.dao;

import main.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}

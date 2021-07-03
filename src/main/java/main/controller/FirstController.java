package main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class FirstController {

    @RequestMapping("/")
    public String getIndex(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        return date;
    }
}

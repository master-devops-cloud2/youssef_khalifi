package com.githubgatestp.web;


import com.githubgatestp.entities.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class API {

    @GetMapping("/book")
    public ResponseEntity<Book> getBook(){

        Book book = Book.builder()
                .id(1L)
                .author("Youssef")
                .publishedDate("22/12/2020")
                .title("End Game")
                .build();

        return ResponseEntity.ok(book);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = List.of(
                Book.builder().id(1L).author("Youssef").publishedDate("22/12/2020").title("End Game").build(),
                Book.builder().id(2L).author("Alice").publishedDate("15/01/2021").title("Spring for Beginners").build(),
                Book.builder().id(3L).author("Bob").publishedDate("10/11/2019").title("Java Essentials").build()
        );


        return ResponseEntity.ok(books);
    }

    @GetMapping("/string")
    public ResponseEntity<String> getString() {


        return ResponseEntity.ok("Hello From earth !!");
    }
}

package com.example.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;




@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner BookstoreDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Java Ohjelmointi - Perusteet", "Matti Ohjelmoinen", 2019, "1212-1212", 29.39));
			repository.save(new Book("Spring Thymeleaf - Perusteet", "Huono Opettaja", 2018, "3453-4565", 89.39));	
			
			log.info("fetch all Books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}

}

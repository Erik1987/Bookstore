package com.example.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
<<<<<<< HEAD
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;

//näin lisätään githubiin
// git add .
// git commit -m "adding more junk"
// git push -u origin master
=======


>>>>>>> 2b38575182241b564768bcddfa4da17135ed6a81


@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
<<<<<<< HEAD
	public CommandLineRunner BookstoreDemo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			log.info("save a couple of books");
			
			crepository.save(new Category("Education"));
			crepository.save(new Category("Novel"));
			crepository.save(new Category("Fantasy"));
			crepository.save(new Category("Sci-Fi"));
			crepository.save(new Category("E-book"));
			
			repository.save(new Book("Java Ohjelmointi - Perusteet", "Matti Ohjelmoinen", 2019, "1212-1212", 29.39, crepository.findByName("Education").get(0)));
			repository.save(new Book("Spring Thymeleaf - Perusteet", "Huono Opettaja", 2018, "3453-4565", 89.39, crepository.findByName("Education").get(0)));	
=======
	public CommandLineRunner BookstoreDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Java Ohjelmointi - Perusteet", "Matti Ohjelmoinen", 2019, "1212-1212", 29.39));
			repository.save(new Book("Spring Thymeleaf - Perusteet", "Huono Opettaja", 2018, "3453-4565", 89.39));	
>>>>>>> 2b38575182241b564768bcddfa4da17135ed6a81
			
			log.info("fetch all Books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}

}

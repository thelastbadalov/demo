package com.example.bookstore;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {
private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book=Book.builder().name("bir developerin yaranishi")
				.price(154.2)
				.stock(2)
				.author("Qulu")
				.build();
		Book book1=Book.builder().name("motivator")
				.price(147.2)
				.stock(4)
				.author("resad")
				.build();
		Book book3=Book.builder().name("heyati mehv olmus bir genc")
				.price(200.3)
				.stock(1)
				.author("Qulu")
				.build();
		bookRepository.saveAll(Arrays.asList(book,book1,book3));
	}
	}




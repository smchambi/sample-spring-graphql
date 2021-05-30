package com.example.leangen.repository;

import com.example.leangen.entity.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	private static final List<Book> booksData = List.of(
			new Book("1", "Harry Potter and the Philosopher's Stone", 223, "1"),
			new Book("2", "Moby Dick", 635, "2"),
			new Book("3", "Interview with the vampire", 371, "3")
	);

	public Optional<Book> find(String id) {
		return booksData.stream().filter(book -> book.getId().equals(id)).findFirst();
	}

	public List<Book> findAll() {
		return booksData;
	}
}

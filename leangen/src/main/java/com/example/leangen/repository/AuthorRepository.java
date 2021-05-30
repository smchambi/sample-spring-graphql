package com.example.leangen.repository;

import com.example.leangen.entity.Author;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {
	private static final List<Author> authorsData = List.of(
			new Author("1", "Joanne", "Rowling"),
			new Author("2", "Herman", "Melville"),
			new Author("3", "Anne", "Rice")
	);

	public Optional<Author> find(String id) {
		return authorsData.stream()
				.filter(author -> author.getId().equals(id))
				.findFirst();
	}

	public List<Author> findAll() {
		return authorsData;
	}

	public List<Author> findWith(String name) {
		return authorsData.stream()
				.filter(author -> author.getFirstName().contains(name))
				.collect(Collectors.toList());
	}
}

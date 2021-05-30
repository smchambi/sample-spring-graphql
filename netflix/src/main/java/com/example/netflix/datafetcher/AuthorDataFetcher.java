package com.example.netflix.datafetcher;

import com.example.netflix.entity.Author;
import com.example.netflix.repository.AuthorRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import java.util.List;
import java.util.Optional;

@DgsComponent
public class AuthorDataFetcher {
	private final AuthorRepository authorRepository;

	public AuthorDataFetcher(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@DgsQuery
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	@DgsQuery
	public Optional<Author> find(String id) {
		return authorRepository.find(id);
	}
}

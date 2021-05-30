package com.example.leangen.service;

import com.example.leangen.entity.Author;
import com.example.leangen.repository.AuthorRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
@GraphQLApi
public class FetchAuthorService {
	private final AuthorRepository authorRepository;

	public FetchAuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@GraphQLQuery
	public Optional<Author> find(String id) {
		return authorRepository.find(id);
	}

	@GraphQLQuery
	public List<Author> findAll() {
		return authorRepository.findAll();
	}
}

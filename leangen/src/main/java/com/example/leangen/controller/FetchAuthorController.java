package com.example.leangen.controller;

import com.example.leangen.entity.Author;
import com.example.leangen.service.FetchAuthorService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchAuthorController {
	private final FetchAuthorService fetchAuthorService;

	public FetchAuthorController(FetchAuthorService fetchAuthorService) {
		this.fetchAuthorService = fetchAuthorService;
	}

	@GetMapping("/authors")
	public List<Author> findAll() {
		return fetchAuthorService.findAll();
	}

	@GetMapping("/authors/{id}")
	public Author find(@PathVariable String id) {
		return fetchAuthorService.find(id).orElse(null);
	}

}

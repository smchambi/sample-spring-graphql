package com.example.leangen;

import graphql.schema.DataFetcher;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GraphQLDataFetchers {
	private static final List<Map<String, String>> books = Arrays.asList(
			Map.of("id", "book-1",
					"name", "Harry Potter and the Philosopher's Stone",
					"pageCount", "223",
					"authorId", "author-1"),
			Map.of("id", "book-2",
					"name", "Moby Dick",
					"pageCount", "635",
					"authorId", "author-2"),
			Map.of("id", "book-3",
					"name", "Interview with the vampire",
					"pageCount", "371",
					"authorId", "author-3")
	);

	private static final List<Map<String, String>> authors = Arrays.asList(
			Map.of("id", "author-1",
					"firstName", "Joanne",
					"lastName", "Rowling"),
			Map.of("id", "author-2",
					"firstName", "Herman",
					"lastName", "Melville"),
			Map.of("id", "author-3",
					"firstName", "Anne",
					"lastName", "Rice")
	);

	public DataFetcher getBookByIdDataFetcher() {
		return dataFetchingEnvironment -> {
			String bookId = dataFetchingEnvironment.getArgument("id");
			return books
					.stream()
					.filter(book -> book.get("id").equals(bookId))
					.findFirst()
					.orElse(null);
		};
	}

	public DataFetcher getAuthorDataFetcher() {
		return dataFetchingEnvironment -> {
			Map<String, String> book = dataFetchingEnvironment.getSource();
			String authorId = book.get("authorId");
			return authors
					.stream()
					.filter(author -> author.get("id").equals(authorId))
					.findFirst()
					.orElse(null);
		};
	}
}

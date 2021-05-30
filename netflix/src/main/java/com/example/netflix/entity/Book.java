package com.example.netflix.entity;

public class Book {
	private final String id;
	private final String name;
	private final Integer pageCount;
	private final String authorId;

	public Book(String id, String name, Integer pageCount, String authorId) {
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.authorId = authorId;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public String getAuthorId() {
		return authorId;
	}
}

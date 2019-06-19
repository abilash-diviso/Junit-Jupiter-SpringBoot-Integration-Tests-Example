package com.diviso.JunitTest;

public class Book {

	private String title;

	private Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static Book fromTitle(String title) {
		return new Book(title);
	}
}

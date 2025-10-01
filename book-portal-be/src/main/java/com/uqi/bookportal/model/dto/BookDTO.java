package com.uqi.bookportal.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BookDTO {

	@NotBlank
	@Size(max = 255, min = 3, message = "Please enter a valid title")
	private String title;

	private int year;

	@NotBlank
	@Size(max = 255, min = 3, message = "Please enter a valid publisher")
	private String publisher;

	private long isbn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

}

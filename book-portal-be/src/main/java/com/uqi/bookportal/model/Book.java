package com.uqi.bookportal.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Books")
public class Book extends EntityBase {

	@Column(name = "TITLE", length = 255)
	private String title;

	@Column(name = "YEAR")
	private int year;

	@Column(name = "PUBLISHER", length = 255)
	private String publisher;

	@Column(name = "ISBN", unique = true)
	private long isbn;

	@ManyToMany(mappedBy = "favoriteList")
	@JsonBackReference
	private Set<User> usersThatAddedThisFavoriteList;

	@ManyToMany(mappedBy = "readList")
	@JsonBackReference
	private Set<User> usersThatAddedThisReadingList;

	@ManyToMany(mappedBy = "books")
	@JsonBackReference
	private Set<Author> authors;

	public Set<User> getUsersThatAddedThisFavoriteList() {
		return usersThatAddedThisFavoriteList;
	}

	public void setUsersThatAddedThisFavoriteList(Set<User> usersThatAddedThisFavoriteList) {
		this.usersThatAddedThisFavoriteList = usersThatAddedThisFavoriteList;
	}

	public Set<User> getUsersThatAddedThisReadingList() {
		return usersThatAddedThisReadingList;
	}

	public void setUsersThatAddedThisReadingList(Set<User> usersThatAddedThisReadingList) {
		this.usersThatAddedThisReadingList = usersThatAddedThisReadingList;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

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

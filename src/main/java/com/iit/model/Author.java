package com.iit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	
	@ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
	@JsonBackReference
	List<Book> books;
	
	@ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
	@JsonBackReference
	List<JournalArticle> journalArticles;
}

package com.iit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	private int id;
	private String title;
	private int edition;
	private int year;
	
	@ManyToOne(targetEntity = Publisher.class)
	@JoinColumn(name = "book_publisher_fk", referencedColumnName = "id")
	Publisher publisher;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "BOOK_AUTHOR",
		joinColumns = {
				@JoinColumn(name = "book_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "author_id", referencedColumnName = "id")
		}
	)
	private List<Author> authors;
	public int getID() {
		return this.id;
	}
}

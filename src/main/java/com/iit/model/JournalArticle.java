package com.iit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class JournalArticle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "JOURNAL_ARTICLE_AUTHOR",
		joinColumns = {
				@JoinColumn(name = "journal_article_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "author_id", referencedColumnName = "id")
		}
	)
	private List<Author> authors;
}

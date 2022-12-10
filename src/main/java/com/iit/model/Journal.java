package com.iit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Journal {

	@Id
	private int id;
	private String title;
	
	@OneToMany(targetEntity = JournalIssue.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "journal_journal_issue_fk", referencedColumnName = "id")
	List<JournalIssue> journalIssues;
	
	@ManyToOne(targetEntity = Publisher.class)
	@JoinColumn(name = "journal_publisher_fk", referencedColumnName = "id")
	Publisher publisher;
}

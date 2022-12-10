package com.iit.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class JournalIssue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private Date publicationDate;
	@OneToMany(targetEntity = JournalArticle.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "journal_issue_journal_article_fk", referencedColumnName = "id")
	List<JournalArticle> journalArticles;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "JOURNAL_ISSUE_EDITOR",
		joinColumns = {
				@JoinColumn(name = "journal_issue_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "editor_id", referencedColumnName = "id")
		}
	)
	private List<Editor> editors;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "JOURNAL_ISSUE_CONTRIBUTOR",
		joinColumns = {
				@JoinColumn(name = "journal_issue_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "contributor_id", referencedColumnName = "id")
		}
	)
	private List<Contributor> contributors;
}

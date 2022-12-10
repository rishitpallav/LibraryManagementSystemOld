package com.iit.model;

import java.util.Date;
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
public class MagazineIssue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private Date publicationDate;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "MAGAZINE_ISSUE_EDITOR",
		joinColumns = {
				@JoinColumn(name = "magazine_issue_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "editor_id", referencedColumnName = "id")
		}
	)
	private List<Editor> editors;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "MAGAZINE_ISSUE_CONTRIBUTOR",
		joinColumns = {
				@JoinColumn(name = "magazine_issue_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "contributor_id", referencedColumnName = "id")
		}
	)
	private List<Contributor> contributors;
}

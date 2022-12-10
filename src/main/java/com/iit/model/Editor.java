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
public class Editor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	
	@ManyToMany(mappedBy = "editors", fetch = FetchType.LAZY)
	@JsonBackReference
	List<MagazineIssue> magazineIssues;
	
	@ManyToMany(mappedBy = "editors", fetch = FetchType.LAZY)
	@JsonBackReference
	List<JournalIssue> journalIssues;
}

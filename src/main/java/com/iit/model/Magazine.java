package com.iit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Magazine {

	@Id
	private int id;
	private String name;
	
	@OneToMany(targetEntity = MagazineIssue.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "magazine_magazine_issue_fk", referencedColumnName = "id")
	List<MagazineIssue> magazineIssues;
}

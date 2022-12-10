package com.iit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String category;
	
	@OneToMany(targetEntity = Copy.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "document_copy_fk", referencedColumnName = "id")
	List<Copy> copy;
}

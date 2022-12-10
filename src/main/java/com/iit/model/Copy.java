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
public class Copy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean isBorrowed;
	private String rack;
	private int floor;
	private String room;
	
	@OneToMany(targetEntity = Borrow.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "copy_borrow_fk", referencedColumnName = "id")
	List<Borrow> borrows;
}

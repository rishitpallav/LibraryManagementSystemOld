package com.iit.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iit.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
}

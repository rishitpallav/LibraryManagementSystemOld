package com.iit.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iit.model.Librarian;
import com.iit.model.Member;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {

	@Query(value = "SELECT * FROM librarian WHERE email = ?1", nativeQuery = true)
	public Librarian selectLibrarianByEmail(String email);
}

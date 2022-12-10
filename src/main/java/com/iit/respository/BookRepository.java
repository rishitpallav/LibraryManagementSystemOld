package com.iit.respository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iit.model.Book;
import com.iit.model.Librarian;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO book (id, edition, title, year, book_publisher_fk) VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	public void insertBook(Integer id, Integer edition, String title, Integer year, Integer publisher);
//	book_id+" "+bookTitle+" "+copies+" "+rack+" "+floor+" "+room+" "+authorId+" "+publisherId+" "+edition+" "+year
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO book_author (book_id, author_id) VALUES (?1, ?2)", nativeQuery = true)
	public void insertBookAuthor(Integer id, Integer author_id);
}

package com.iit.respository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iit.model.Librarian;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {

	@Query(value = "SELECT * FROM librarian WHERE email = ?1", nativeQuery = true)
	public Librarian selectLibrarianByEmail(String email);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO author (id, address, email, first_name, last_name) VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	public void insertAuthor(Integer id, String address, String email, String firstName, String lastName);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO publisher (id, address, email, first_name, last_name) VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	public void insertPublisher(Integer id, String address, String email, String firstName, String lastName);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO editor (id, first_name, last_name) VALUES (?1, ?2, ?3)", nativeQuery = true)
	public void insertEditor(Integer id, String firstName, String lastName);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO contributor (id, first_name, last_name) VALUES (?1, ?2, ?3)", nativeQuery = true)
	public void insertContributor(Integer id, String firstName, String lastName);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO magazine_issue(id, publication_date, title) VALUES(?1, DATE ?2, ?3)", nativeQuery = true)
	public void insertMagazineIssue(Integer id, String date, String title);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO magazine_issue_contributor(magazine_issue_id, contributor_id) VALUES(?1, ?2)", nativeQuery = true)
	public void insertMagazineIssueContributor(Integer magazineIssueId, Integer contributorId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO magazine_issue_editor(magazine_issue_id, editor_id) VALUES(?1, ?2)", nativeQuery = true)
	public void insertMagazineIssueEditor(Integer magazineIssueId, Integer editorId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO magazine(id, name) VALUES(?1, ?2)", nativeQuery = true)
	public void insertMagazine(Integer magazineId, String name);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE magazine_issue SET magazine_magazine_issue_fk = ?1 WHERE id = ?2", nativeQuery = true)
	public void updateMagazineInMagazineIssue(Integer magazineId, Integer magazineIssueId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO journal_article(id, title) VALUES(?1, ?2)", nativeQuery = true)
	public void insertJournalArticle(Integer journalArticleId, String title);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO journal_article_author(journal_article_id, author_id) VALUES(?1, ?2)", nativeQuery = true)
	public void insertJournalArticleAuthor(Integer journalArticleAuthorId, Integer authorId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO journal_issue(id, publication_date, title) VALUES(?1, ?2, ?3)", nativeQuery = true)
	public void insertJournalIssue(Integer journalIssueId, String publicationDate, String title);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE journal_article SET journal_issue_journal_article_fk = ?1 WHERE id = ?2", nativeQuery = true)
	public void updateJournalIssueInJournalArticle(Integer journalIssueId, Integer journalArticleId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO journal_issue_contributor(journal_issue_id, contributor_id) VALUES(?1, ?2)", nativeQuery = true)
	public void insertJournalIssueContributor(Integer journalIssueId, Integer contributorId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO journal_issue_editor(journal_issue_id, editor_id) VALUES(?1, ?2)", nativeQuery = true)
	public void insertJournalIssueEditor(Integer journalIssueId, Integer editorId);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO journal(id, title, journal_publisher_fk) VALUES(?1, ?2, ?3)", nativeQuery = true)
	public void insertJournal(Integer journalId, String title, Integer publisherId);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE journal_issue SET journal_journal_issue_fk = ?1 WHERE id = ?2", nativeQuery = true)
	public void updateJournalInJournalIssue(Integer journalId, Integer journalIssueId);
}

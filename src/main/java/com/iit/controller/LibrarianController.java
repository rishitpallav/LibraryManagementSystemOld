<<<<<<< Updated upstream
package com.iit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iit.model.Librarian;
import com.iit.model.Magazine;
import com.iit.model.Book;
import com.iit.respository.AuthorRepository;
import com.iit.respository.LibrarianRepository;

@Controller
public class LibrarianController {

	@Autowired
	LibrarianRepository librarianRepository;

	@Autowired
	AuthorRepository authorRepository;

	Librarian currentLibrarian;
	Book currentBook;
	Magazine currentMagazine;

	@GetMapping("/librarianLogin/{email}")
	public ModelAndView postLogin(@PathVariable String email) {
		System.out.println(email);
		ModelAndView mv = new ModelAndView();
		currentLibrarian = librarianRepository.selectLibrarianByEmail(email);
		System.out.println(currentLibrarian.toString());
		if (!currentLibrarian.equals(null)) {
			mv.setViewName("librarianHomepage");
			mv.addObject("currentMember", currentLibrarian);
		} else {
			System.out.println("Login Failed");
			mv.setViewName("login");
		}
		return mv;
	}

	@GetMapping("/librarianHomepage")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("librarianHomepage");
		mv.addObject("currentLibrarian", currentLibrarian);
		return mv;
	}

	

	@GetMapping("/addMagazine")
	public ModelAndView addMagazine() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addMagazine");
		return mv;
	}

	@GetMapping("/addMagazineIssue")
	public ModelAndView addMagazineIssue() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addMagazineIssue");
		return mv;
	}

	@GetMapping("/addEditor")
	public ModelAndView addEditor() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addEditor");
		return mv;
	}

	@GetMapping("/addContributor")
	public ModelAndView addContributor() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addContributor");
		return mv;
	}

	@GetMapping("/addAuthor")
	public ModelAndView getAddAuthor() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addAuthor");
		return mv;
	}

	@GetMapping("/addPublisher")
	public ModelAndView getAddPublisher() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addPublisher");
		return mv;
	}

	@PostMapping("/addAuthor")
	public ModelAndView postAddAuthor(@Param("authorId") int authorId, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("address") String address, @Param("email") String email) {
		System.out.println(authorId + " " + firstName + " " + lastName + " " + address + " " + email);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertAuthor(authorId, firstName, lastName, address, email);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addPublisher")
	public ModelAndView postAddPublisher(@Param("publisherId") int publisherId, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("address") String address, @Param("email") String email) {
		System.out.println(publisherId + " " + firstName + " " + lastName + " " + address + " " + email);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertPublisher(publisherId, firstName, lastName, address, email);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addEditor")
	public ModelAndView postAddEditor(@Param("editorId") int editorId, @Param("firstName") String firstName,
			@Param("lastName") String lastName) {
		System.out.println(editorId + " " + firstName + " " + lastName);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertEditor(editorId, firstName, lastName);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addContributor")
	public ModelAndView postAddContributor(@Param("contributorId") int contributorId,
			@Param("firstName") String firstName, @Param("lastName") String lastName) {
		System.out.println(contributorId + " " + firstName + " " + lastName);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertContributor(contributorId, firstName, lastName);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addMagazineIssue")
	public ModelAndView postAddMagazineIssue(@Param("magazineIssueId") int magazineIssueId,
			@Param("title") String title, @Param("datePublished") String datePublished,
			@Param("editorId") String editorId, @Param("contributorId") String contributorId) {
		ModelAndView mv = new ModelAndView();
		System.out.println(magazineIssueId +" "+ title +" "+ datePublished +" "+ editorId +" "+ contributorId);
		librarianRepository.insertMagazineIssue(magazineIssueId, datePublished, title);
		List<String> editorList = Arrays.asList((editorId.split(",")));
		for(String editorIdentity : editorList) {
			librarianRepository.insertMagazineIssueEditor(magazineIssueId, Integer.parseInt(editorIdentity));
		}
		List<String> contributorList = Arrays.asList((contributorId.split(",")));
		for(String contributorIdentity : contributorList) {
			librarianRepository.insertMagazineIssueContributor(magazineIssueId, Integer.parseInt(contributorIdentity));
		}
		mv.setViewName("librarianHomepage");
		return mv;
	}

}
=======
package com.iit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iit.model.Librarian;
import com.iit.model.Magazine;
import com.iit.model.Book;
import com.iit.respository.AuthorRepository;
import com.iit.respository.LibrarianRepository;

@Controller
public class LibrarianController {

	@Autowired
	LibrarianRepository librarianRepository;

	@Autowired
	AuthorRepository authorRepository;

	Librarian currentLibrarian;
	Book currentBook;
	Magazine currentMagazine;

	@GetMapping("/librarianLogin/{email}")
	public ModelAndView postLogin(@PathVariable String email) {
		System.out.println(email);
		ModelAndView mv = new ModelAndView();
		currentLibrarian = librarianRepository.selectLibrarianByEmail(email);
		System.out.println(currentLibrarian.toString());
		if (!currentLibrarian.equals(null)) {
			mv.setViewName("librarianHomepage");
			mv.addObject("currentMember", currentLibrarian);
		} else {
			System.out.println("Login Failed");
			mv.setViewName("login");
		}
		return mv;
	}

	@GetMapping("/librarianHomepage")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("librarianHomepage");
		mv.addObject("currentLibrarian", currentLibrarian);
		return mv;
	}

	@GetMapping("/addBook")
	public ModelAndView addBook() {
		System.out.println("id");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addBook");
		return mv;
	}

	@GetMapping("/addMagazine")
	public ModelAndView addMagazine() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addMagazine");
		return mv;
	}

	@GetMapping("/addMagazineIssue")
	public ModelAndView addMagazineIssue() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addMagazineIssue");
		return mv;
	}

	@GetMapping("/addEditor")
	public ModelAndView addEditor() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addEditor");
		return mv;
	}

	@GetMapping("/addContributor")
	public ModelAndView addContributor() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addContributor");
		return mv;
	}

	@GetMapping("/addAuthor")
	public ModelAndView getAddAuthor() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addAuthor");
		return mv;
	}

	@GetMapping("/addPublisher")
	public ModelAndView getAddPublisher() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addPublisher");
		return mv;
	}

	@GetMapping("/addJournal")
	public ModelAndView getAddJournal() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addJournal");
		return mv;
	}

	@GetMapping("/addJournalIssue")
	public ModelAndView getAddJournalIssue() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addJournalIssue");
		return mv;
	}

	@GetMapping("/addJournalArticle")
	public ModelAndView getAddJournalArticle() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addJournalArticle");
		return mv;
	}

	@PostMapping("/addAuthor")
	public ModelAndView postAddAuthor(@Param("authorId") int authorId, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("address") String address, @Param("email") String email) {
		System.out.println(authorId + " " + firstName + " " + lastName + " " + address + " " + email);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertAuthor(authorId, firstName, lastName, address, email);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addPublisher")
	public ModelAndView postAddPublisher(@Param("publisherId") int publisherId, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("address") String address, @Param("email") String email) {
		System.out.println(publisherId + " " + firstName + " " + lastName + " " + address + " " + email);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertPublisher(publisherId, firstName, lastName, address, email);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addEditor")
	public ModelAndView postAddEditor(@Param("editorId") int editorId, @Param("firstName") String firstName,
			@Param("lastName") String lastName) {
		System.out.println(editorId + " " + firstName + " " + lastName);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertEditor(editorId, firstName, lastName);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addContributor")
	public ModelAndView postAddContributor(@Param("contributorId") int contributorId,
			@Param("firstName") String firstName, @Param("lastName") String lastName) {
		System.out.println(contributorId + " " + firstName + " " + lastName);
		ModelAndView mv = new ModelAndView();
		librarianRepository.insertContributor(contributorId, firstName, lastName);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addMagazineIssue")
	public ModelAndView postAddMagazineIssue(@Param("magazineIssueId") int magazineIssueId,
			@Param("title") String title, @Param("datePublished") String datePublished,
			@Param("editorId") String editorId, @Param("contributorId") String contributorId) {
		ModelAndView mv = new ModelAndView();
		System.out.println(magazineIssueId + " " + title + " " + datePublished + " " + editorId + " " + contributorId);
		librarianRepository.insertMagazineIssue(magazineIssueId, datePublished, title);
		List<String> editorList = Arrays.asList((editorId.split(",")));
		for (String editorIdentity : editorList) {
			librarianRepository.insertMagazineIssueEditor(magazineIssueId, Integer.parseInt(editorIdentity));
		}
		List<String> contributorList = Arrays.asList((contributorId.split(",")));
		for (String contributorIdentity : contributorList) {
			librarianRepository.insertMagazineIssueContributor(magazineIssueId, Integer.parseInt(contributorIdentity));
		}
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addMagazine")
	public ModelAndView postAddMagazine(@Param("magazineId") int magazineId, @Param("magazineName") String magazineName,
			@Param("issueId") String issueId) {
		ModelAndView mv = new ModelAndView();
		System.out.println(magazineId + " " + magazineName + " " + issueId);
		librarianRepository.insertMagazine(magazineId, magazineName);
		List<String> issueIdList = Arrays.asList((issueId.split(",")));
		for (String issueIdentity : issueIdList) {
			librarianRepository.updateMagazineInMagazineIssue(magazineId, Integer.parseInt(issueIdentity));
		}
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addJournalArticle")
	public ModelAndView postAddJournalArticle(@Param("journalArticleId") int journalArticleId,
			@Param("title") String title, @Param("authorId") String authorId) {
		ModelAndView mv = new ModelAndView();
		System.out.println(journalArticleId + " " + title + " " + authorId);
		librarianRepository.insertJournalArticle(journalArticleId, title);
		List<String> issueIdList = Arrays.asList((authorId.split(",")));
		for (String issueIdentity : issueIdList) {
			librarianRepository.insertJournalArticleAuthor(journalArticleId, Integer.parseInt(issueIdentity));
		}
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addJournalIssue")
	public ModelAndView postAddJournalIssue(@Param("journalIssueId") int journalIssueId, @Param("title") String title,
			@Param("datePublished") String datePublished, @Param("editorId") String editorId,
			@Param("contributorId") String contributorId, @Param("journalArticleId") int journalArticleId) {
		ModelAndView mv = new ModelAndView();
		System.out.println(journalIssueId + " " + title + " " + datePublished + " " + editorId + " " + contributorId
				+ " " + journalArticleId);
		librarianRepository.insertJournalIssue(journalIssueId, datePublished, title);

		List<String> editorList = Arrays.asList((editorId.split(",")));
		for (String editorIdentity : editorList) {
			librarianRepository.insertJournalIssueEditor(journalIssueId, Integer.parseInt(editorIdentity));
		}
		List<String> contributorList = Arrays.asList((contributorId.split(",")));
		for (String contributorIdentity : contributorList) {
			librarianRepository.insertJournalIssueContributor(journalIssueId, Integer.parseInt(contributorIdentity));
		}

		librarianRepository.updateJournalIssueInJournalArticle(journalIssueId, journalArticleId);
		mv.setViewName("librarianHomepage");
		return mv;
	}

	@PostMapping("/addJournal")
	public ModelAndView postAddJournal(@Param("journalId") int journalId, @Param("title") String title,
			@Param("publisherId") int publisherId, @Param("issueId") String issueId) {
		ModelAndView mv = new ModelAndView();
		System.out.println(journalId + " " + title + " " + publisherId + " " + issueId);
		librarianRepository.insertJournal(journalId, title, publisherId);
		List<String> issueIdList = Arrays.asList((issueId.split(",")));
		for (String issueIdentity : issueIdList) {
			librarianRepository.updateJournalInJournalIssue(journalId, Integer.parseInt(issueIdentity));
		}
		mv.setViewName("librarianHomepage");
		return mv;
	}

}
>>>>>>> Stashed changes

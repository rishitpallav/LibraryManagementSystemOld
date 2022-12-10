package com.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iit.respository.BookRepository;
import com.iit.respository.LibrarianRepository;

@Controller
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/addBook")
	public ModelAndView addBook() {
		System.out.println("id");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addBook");
		return mv;
	}
	@PostMapping("/addBook")
	public ModelAndView postAddBook(@Param("book_id") int book_id, @Param("bookTitle") String bookTitle,@Param("copies") int copies,@Param("rack") String rack,
			@Param("floor") int floor,@Param("room") int room,@Param("authorId") int authorId,@Param("publisherId") int publisherId,@Param("edition") int edition,@Param("year") int year) {
		System.out.println(book_id+" "+bookTitle+" "+copies+" "+rack+" "+floor+" "+room+" "+authorId+" "+publisherId+" "+edition+" "+year);
		ModelAndView mv = new ModelAndView();
		bookRepository.insertBook(book_id, edition, bookTitle, year, publisherId);
		bookRepository.insertBookAuthor(book_id, authorId);
		mv.setViewName("addBook");
		return mv;
	}
}

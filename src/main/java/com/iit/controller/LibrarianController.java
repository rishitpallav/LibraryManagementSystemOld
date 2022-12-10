package com.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.iit.model.Librarian;
import com.iit.respository.LibrarianRepository;

@Controller
public class LibrarianController {

	@Autowired
	LibrarianRepository librarianRepository;
	
	Librarian currentLibrarian;
	
	@GetMapping("/librarianLogin/{email}")
	public ModelAndView postLogin(@PathVariable String email) {
		System.out.println(email);
		ModelAndView mv = new ModelAndView();
		currentLibrarian = librarianRepository.selectLibrarianByEmail(email);
		System.out.println(currentLibrarian.toString());
		if(!currentLibrarian.equals(null)) {
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
}

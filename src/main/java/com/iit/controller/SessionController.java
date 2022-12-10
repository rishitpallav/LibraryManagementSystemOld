package com.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iit.model.Member;
import com.iit.respository.MemberRepository;

@Controller
public class SessionController {

	@Autowired
	MemberRepository memberRepository;
	
	Member currentMember;
	
	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@GetMapping("/homepage")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("homepage");
		mv.addObject("currentMember", currentMember);
		return mv;
	}
	
	@GetMapping("/login/{email}")
	public ModelAndView postLogin(@PathVariable String email) {
		ModelAndView mv = new ModelAndView();
		currentMember = memberRepository.selectMemberByEmail(email);
		if(!currentMember.equals(null)) {
			mv.setViewName("homepage");
			mv.addObject("currentMember", currentMember);
		} else {
			System.out.println("Login Failed");
			mv.setViewName("login");
		}
		return mv;
	}
	
	@PostMapping("/search")
	public ModelAndView search(@Param("searchText") String searchText) {
		ModelAndView mv = new ModelAndView();
		System.out.println(searchText);
		mv.setViewName("homepage");
		return mv;
	}
}

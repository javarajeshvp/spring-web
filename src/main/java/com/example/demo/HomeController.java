package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.demo.util.Output;

@Controller
public class HomeController {

	/*
	 * @RequestMapping("home") public String homePage(HttpServletRequest request) {
	 * Output.print("in home"); HttpSession session = request.getSession();
	 * session.setAttribute("name", request.getParameter("name")); return "home"; }
	 */

	@RequestMapping("home")
	public ModelAndView homePage(@RequestParam("name") String myName, @RequestParam("age") String myAge) {
		Output.print("in home");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName);
		mv.addObject("age",myAge);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("candidate")
	public ModelAndView candidatePage(Candidate candidate) {
		Output.print("in home");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",candidate);

		mv.setViewName("home");
		return mv;
	}
}

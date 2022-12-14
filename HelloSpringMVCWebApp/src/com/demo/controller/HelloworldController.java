package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/",method=RequestMethod.GET)
public class HelloworldController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("welcomePage", "welcomeMessage", "Welcome to Spring MVC World!!!");
	}

	@RequestMapping(value = "/")
	public String welcome(Model m) {
		m.addAttribute("welcomeMessage", "Welcome to Spring MVC World!!!");

		return "welcomePage";
	}

	@RequestMapping(value = "/hello")
	public String welcome1(Model m) {
		m.addAttribute("welcomeMessage", "Welcome to Spring MVC World!!!");

		return "welcomePage";
	}
}

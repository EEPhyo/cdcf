package com.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ai.model.User;

@Controller
public class HomeController {

	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home() {
		return "/frontend/home";
	}
}

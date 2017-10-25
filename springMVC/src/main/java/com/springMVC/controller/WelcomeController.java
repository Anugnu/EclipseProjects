package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String welcomeMessage(ModelMap model){
		
		model.addAttribute("message", "Welcome to my First SpringMVC");
		
		return "welcome";
	}
	
	@RequestMapping(value="/test/{userName:.+}",method=RequestMethod.GET)
	public ModelAndView welcomeUserMessage(@PathVariable("userName")String userName){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		model.addObject("message",userName);
		
		return model;
		
	}
}

package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Main {
	
	 @Autowired
	    private RegisterService registerService;

	@RequestMapping("/")
	public String start() {
			return "index.html";
	}
	
	
	 @PostMapping("/processForm")
	  public ModelAndView processForm(@ModelAttribute RegisterBean rb, ModelAndView m) {
	        return registerService.processForm(rb, m);
	   }
	

	
	
}
package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.Actor;
import com.github.jakubslazyk.entity.Movie;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	private ServiceLayer <Movie> myService;

	@GetMapping("/")
	public String indexPage(Model theModel){
		theModel.addAttribute("movies",myService.getAll("Movie"));
		theModel.addAttribute("bestMovie",myService.getBestMovie());
		return "index";
	}
	@GetMapping("/register")
	public String registerPage(){
		return "register/register";
	}
	
}

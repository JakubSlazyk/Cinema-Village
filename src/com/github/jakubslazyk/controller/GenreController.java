package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.Genre;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/genres")
public class GenreController {

	@Autowired
	private ServiceLayer <Genre> myService;
	
	@GetMapping("/list")
	public String hallsList(Model theModel){
		theModel.addAttribute("data",myService.getAll("Genre"));
		return "genres/genres-list";
	}
	
	@GetMapping("/showAdd")
	public String showAdd(Model theModel){
		theModel.addAttribute("data",new Genre());
		return "genres/add_genre";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute("data") Genre genre){
		myService.add(genre);
		return "redirect:/genres/list";
	}
	
	
	
}

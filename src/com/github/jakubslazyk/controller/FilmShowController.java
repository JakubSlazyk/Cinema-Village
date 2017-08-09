package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.FilmShow;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/film_shows")
public class FilmShowController {

	@Autowired
	private ServiceLayer <FilmShow> myService;
	
	@GetMapping("/list")
	public String hallsList(Model theModel){
		theModel.addAttribute("data",myService.getAll("FilmShow"));
		return "film_show/film_show-list";
	}
}

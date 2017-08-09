package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.GenreApperence;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/genre_apperence")
public class GenreApperenceController {

	@Autowired
	private ServiceLayer <GenreApperence> myService;
	
	@GetMapping("/list")
	public String hallsList(Model theModel){
		theModel.addAttribute("data",myService.getAll("GenreApperence"));
		return "genre_apperence/genre_apperence-list";
	}

}

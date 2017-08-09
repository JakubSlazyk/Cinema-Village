package com.github.jakubslazyk.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.Actor;
import com.github.jakubslazyk.entity.Movie;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private ServiceLayer <Movie> myService;

	
	@GetMapping("/list")
	public String moviesList(Model theModel){
		List <Movie> movies=myService.getAll("Movie");
		theModel.addAttribute("data",movies);		
		return "movies/movies";
	}
	
	@GetMapping("/showAdd")
	public String showAdd(Model theModel){
		List <String> list= new LinkedList<String>();
		theModel.addAttribute("data",new Movie());
		theModel.addAttribute("list",list);
		return "movies/add_movie";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute("data") Movie data){
		myService.add(data);
		return "redirect:/movies/list";
	}
	
	
}

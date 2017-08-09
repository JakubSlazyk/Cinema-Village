package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.Hall;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/halls")
public class HallController {

	@Autowired
	private ServiceLayer <Hall> myService;
	
	@GetMapping("/list")
	public String hallsList(Model theModel){
		theModel.addAttribute("data",myService.getAll("Hall"));
		return "halls/halls-list";
	}

}

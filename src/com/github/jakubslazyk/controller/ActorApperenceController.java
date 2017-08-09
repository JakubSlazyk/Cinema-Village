package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jakubslazyk.entity.ActorApperence;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/actor_apperence")
public class ActorApperenceController {

	@Autowired
	private ServiceLayer <ActorApperence> myService;
	
	@GetMapping("/list")
	public String hallsList(Model theModel){
		theModel.addAttribute("data",myService.getAll("ActorApperence"));
		return "actor_apperence/actor_apperence-list";
	}
}

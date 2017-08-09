package com.github.jakubslazyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.jakubslazyk.entity.Actor;
import com.github.jakubslazyk.entity.Director;
import com.github.jakubslazyk.service.ServiceLayer;

@Controller
@RequestMapping("/directors")
public class DirectorController {

	@Autowired
	private ServiceLayer <Director> myService;
	
	@GetMapping("/list")
	public String hallsList(Model theModel){
		theModel.addAttribute("data",myService.getAll("Director"));
		return "directors/directors-list";
	}
	@GetMapping("/showAdd")
	public String showAdd(Model theModel){
		String date="";
		theModel.addAttribute("data",new Director());
		theModel.addAttribute("date",date);
		return "directors/add_director";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute("data") Director data,@ModelAttribute("date")String date,RedirectAttributes ra){
		data.setBirth_date(date);
		myService.add(data);
		return "redirect:/directors/list";
	}
}

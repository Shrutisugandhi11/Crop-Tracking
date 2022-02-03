package com.example.demo.login.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.login.domain.Farmer;
import com.example.demo.login.service.FarmerService;

@Controller
public class FarmerController {
	
	@Autowired
	private FarmerService farmerService;
	
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("farmer", new Farmer());
		return mav;
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("farmer") Farmer farmer) {
		Farmer oauthFarmer =farmerService.login(farmer.getFarmername(),farmer.getPassword());
		System.out.println(oauthFarmer);
		if(Objects.nonNull(oauthFarmer)) {
			return "redirect:/";
		}
		else {
			return"redirect:/login";
		}
	}

	
}

package com.devsuperior.dscomerce1.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public String home() {
		return "index";
	}

}

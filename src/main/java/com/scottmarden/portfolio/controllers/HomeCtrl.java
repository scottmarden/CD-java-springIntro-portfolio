package com.scottmarden.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/about_route")
	public String loadAbout() {
		return "about.html";
	}
	
	@RequestMapping("/portfolio_route")
	public String loadPortfolio() {
		return "portfolio.html";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	

}

package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// "/" to show which mapping it will take
	@RequestMapping("/")
	public String home() {
		return "Das Boot, reporting for duty!";
	}
}

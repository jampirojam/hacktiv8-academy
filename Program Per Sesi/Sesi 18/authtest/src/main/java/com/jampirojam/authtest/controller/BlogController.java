package com.jampirojam.authtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@RequestMapping({"/hello"})
	public String firstPage() {
		return "Hello World";
	}

}

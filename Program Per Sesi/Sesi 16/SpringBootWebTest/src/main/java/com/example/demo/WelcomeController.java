package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	private String pesan = "Hello from Spring Web Test";
	private List<String> tugas = Arrays.asList("a", "b", "c", "d", "e");
	
	@GetMapping("/")
	public String main (Model model) {
		model.addAttribute("pesan", pesan);
		model.addAttribute("tugas", tugas);
		
		return "Welcome";
	}
	
	@GetMapping("/h")
	public String mainWithParam (@RequestParam(name = "name", required = false, defaultValue = "Aku") String name, Model model) {
		model.addAttribute("pesan", name);
		
		return "Welcome";
	}
}

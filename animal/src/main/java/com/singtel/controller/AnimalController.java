package com.singtel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.service.Duck;

@RestController
public class AnimalController {
	@GetMapping("/animal")
	public String getAnimalProperties(@RequestParam String animal) {
		
		
		

		
		
		return null;
	}

}

package com.jenkin.jenkineApiGenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@GetMapping("getdata")
	public String welcomeNote() {
		return "welcome lokesh";
		
	}
	@GetMapping("welcome")
	public String getJenkins() {
		return "welcome jenkins";
		
	}
}

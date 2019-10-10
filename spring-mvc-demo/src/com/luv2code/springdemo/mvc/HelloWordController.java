package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloWordController {
	
	@RequestMapping("/showForm")
	public String showPage() {
		return "helloworld-form";
	}
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

}

package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting") //HTTP-запросы GET /greeting сопоставляются с greeting() методом
	public String greeting(@RequestParam(name="user_name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("user_name", name);
		return "greeting";
	}

}

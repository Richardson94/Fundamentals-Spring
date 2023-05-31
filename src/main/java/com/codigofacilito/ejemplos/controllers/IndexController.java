package com.codigofacilito.ejemplos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	@GetMapping(value="/")
	public String index(Model model) {
		model.addAttribute("title","Im the title");
		model.addAttribute("welcomer","hello Richardson");
		return "index";
	}
	
	@RequestMapping(value="index-req-mapping",method = RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}
	
	@PostMapping(value="/index-post")
	public String indexRequestPostMapping() {
		return "index";
	}

}

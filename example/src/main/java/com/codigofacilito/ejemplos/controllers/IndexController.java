package com.codigofacilito.ejemplos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("title", "Im the title");
		model.addAttribute("welcomer", "hello Richardson");
		model.addAttribute("show", false);
		List<String> series = null;// List.of("Dexter","Game of Thrones","Vikings");
		model.addAttribute("series", series);
		return "index";
	}

	@RequestMapping(value = "index-req-mapping", method = RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}

	@GetMapping(value = "/index-mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("title", "title of MV");
		mv.addObject("welcomer", "title of MV");
		mv.addObject("swow", true);
		//List<String> series = List.of("Dexter","Game of Thrones","Vikings");
		//mv.addObject("series", series);
		mv.setViewName("index");
		return mv;
	}
	
	@ModelAttribute("series")
	public List<String> getSeries(){
		return List.of("Dexter","Game of Thrones", "Vikings","flash","the last of us");
	}

	@PostMapping(value = "/index-post")
	public String indexRequestPostMapping() {
		return "index";
	}

}

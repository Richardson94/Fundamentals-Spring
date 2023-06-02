package com.codigofacilito.movies.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codigofacilito.movies.entities.Actor;
import com.codigofacilito.movies.entities.Movie;
import com.codigofacilito.movies.service.IActorService;
import com.codigofacilito.movies.service.IGenderService;
import com.codigofacilito.movies.service.IMovieService;

@Controller
public class MovieController {
	private IMovieService service;
	private IGenderService genderService;
	private IActorService actorService;

	public MovieController(IMovieService service, IGenderService genderService, IActorService actorService) {
		this.service = service;
		this.genderService = genderService;
		this.actorService = actorService;
	}

	@GetMapping("/movie")
	public String create(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		model.addAttribute("genders", genderService.findAll());
		model.addAttribute("actors",actorService.findAll());
		model.addAttribute("title", "New Movie");
		return "movie";
	}

	@GetMapping("/movie/{id}")
	public String edit(@PathVariable(name = "id") Long id, Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		model.addAttribute("genders", genderService.findAll());
		model.addAttribute("actors",actorService.findAll());
		model.addAttribute("title", "New Movie");
		return "movie";
	}

	@PostMapping("/movie")
	public String Save(Movie movie, @ModelAttribute(name="ids") String ids) {
		
		List<Long> idsProtaginist = Arrays.stream(ids.split(",")).map(Long::parseLong).collect(Collectors.toList());
		List<Actor> protagonist = actorService.findAllById(idsProtaginist);
		movie.setProtagonist(protagonist);
		
		service.save(movie);
		return "redirect:home";
	}

	@GetMapping({ "/", "/home", "/index" })
	public String home() {
		return "home";
	}
}

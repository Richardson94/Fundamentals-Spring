package com.codigofacilito.ejemplos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.codigofacilito.ejemplos.models.Player;
import com.codigofacilito.ejemplos.models.Team;
import com.codigofacilito.ejemplos.services.IService;

@Controller
public class ParamsController {

	private IService teamService;

	public ParamsController(@Qualifier("teamSpain") IService teamService) {
		this.teamService = teamService;
	}

	@GetMapping("/parameters")
	public String parameters(@RequestParam(defaultValue = "Default") String val1,
			@RequestParam(defaultValue = "") String val2, Model model) {
		model.addAttribute("title", "parameters");
		model.addAttribute("parameterOne", val1);
		model.addAttribute("parameterTwo", val2);
		return "parameters";
	}

	@GetMapping("/teams/{name}/{number}")
	public String ParametersPerPath(@PathVariable String name, @PathVariable("number") Integer number, Model model) {

		Optional<Team> teamOptional = teamService.getAll().stream().filter(team -> name.equals(team.getNameTeam()))
				.findFirst();

		if (teamOptional.isPresent()) {
			Optional<Player> playerOptional = teamOptional.get().getList().stream()
					.filter(player -> number == player.getNumber()).findFirst();

			if (playerOptional.isPresent()) {
				model.addAttribute("player", playerOptional.get());
			}
		}

		return "parameters";
	}

}

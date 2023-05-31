package com.codigofacilito.ejemplos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.codigofacilito.ejemplos.models.Player;
import com.codigofacilito.ejemplos.models.Team;

@Controller
public class ParamsController {

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

		Optional<Team> teamOptional = getTeams().stream().filter(team -> name.equals(team.getNameTeam())).findFirst();

		if (teamOptional.isPresent()) {
			Optional<Player> playerOptional = teamOptional.get().getList().stream()
					.filter(player -> number == player.getNumber()).findFirst();

			if (playerOptional.isPresent()) {
				model.addAttribute("player",playerOptional.get());
			}
		}

		return "parameters";
	}

	private List<Team> getTeams() {
		Team barcelona = new Team();
		barcelona.setNameTeam("Barcelona");
		barcelona.addPlayer(new Player("Ter STEGEN", 1));
		barcelona.addPlayer(new Player("ARAUDO", 4));
		barcelona.addPlayer(new Player("BUSQUETS", 5));
		barcelona.addPlayer(new Player("ARMANDO HERRERA", 9));
		barcelona.addPlayer(new Player("MESSI", 19));
		barcelona.addPlayer(new Player("PELE", 2));

		Team realMadrid = new Team();
		realMadrid.setNameTeam("RealMadrid");
		realMadrid.addPlayer(new Player("Iker Casillas", 25));
		realMadrid.addPlayer(new Player("Pike", 3));
		realMadrid.addPlayer(new Player("maradona", 15));
		realMadrid.addPlayer(new Player("Iniesta", 10));
		realMadrid.addPlayer(new Player("CondorCanqui", 20));
		realMadrid.addPlayer(new Player("Surni", 30));

		return List.of(barcelona, realMadrid);
	}
}

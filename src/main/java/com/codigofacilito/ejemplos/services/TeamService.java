package com.codigofacilito.ejemplos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codigofacilito.ejemplos.models.Player;
import com.codigofacilito.ejemplos.models.Team;

@Service("teamSpain")
public class TeamService implements IService {
	public List<Team> getAll() {
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

package com.codigofacilito.ejemplos.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.codigofacilito.ejemplos.models.Player;
import com.codigofacilito.ejemplos.models.Team;

@Service
@Primary
public class TeamEnglandService implements IService {

	@Override
	public List<Team> getAll() {
		Team manchesterUnited = new Team(); 
		manchesterUnited.setNameTeam("ManchesterUnited");
		manchesterUnited.addPlayer(new Player("GARNACHO", 49));
	

		Team ManchesterCity = new Team();
		ManchesterCity.setNameTeam("ManchesterCity");
		ManchesterCity.addPlayer(new Player("J ALVAREZ",9 ));
		

		return List.of(manchesterUnited, ManchesterCity);

	}
}

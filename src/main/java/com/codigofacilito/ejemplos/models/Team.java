package com.codigofacilito.ejemplos.models;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String nameTeam;
	private List<Player> list;
	
	public Team() {
		list = new ArrayList();
	}
	
	public String getNameTeam() {
		return nameTeam;
	}
	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}
	public List<Player> getList() {
		return list;
	}
	public void setList(List<Player> list) {
		this.list = list;
	}
	public void addPlayer(Player player) {
		list.add(player);
	}
	
}

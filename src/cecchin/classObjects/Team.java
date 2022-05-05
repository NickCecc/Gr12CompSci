package cecchin.classObjects;

import java.util.ArrayList;

public class Team {

	// Create a Team class. Its attributes include: sport (String), numPlayers
	// (int), coach (String), and players (ArrayList<String>). Encapsulate all data.
	// Include a toString() method. In the Main() program, create a Team. Create 3
	// players (adding them to an ArrayList), and add this roster to the team. Print
	// out the team info using the toString() method.

	private String sport;
	private int numPlayers;
	private String coach;

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	
}

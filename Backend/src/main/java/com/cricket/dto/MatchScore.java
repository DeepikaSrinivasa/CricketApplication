package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchScore {

	private Team1Score team1Score;

	private Team2Score team2Score;

	public Team1Score getTeam1Score() {
		return team1Score;
	}

	public void setTeam1Score(Team1Score team1Score) {
		this.team1Score = team1Score;
	}

	public Team2Score getTeam2Score() {
		return team2Score;
	}

	public void setTeam2Score(Team2Score team2Score) {
		this.team2Score = team2Score;
	}

	@Override
	public String toString() {
		return "MatchScore [team1Score=" + team1Score + ", team2Score=" + team2Score + "]";
	}

}

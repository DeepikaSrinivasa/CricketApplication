package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PointsTableInfo {
	
	
	private Long teamId;
	
	private String teamName;
	
	private Integer matchesPlayed;
	
	private Integer matchesWon;
	
	private Integer matchesLost;
	
	private Integer points;
	
	private String nrr;

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	

	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public Integer getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(Integer matchesWon) {
		this.matchesWon = matchesWon;
	}

	public Integer getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(Integer matchesLost) {
		this.matchesLost = matchesLost;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getNrr() {
		return nrr;
	}

	public void setNrr(String nrr) {
		this.nrr = nrr;
	}

	@Override
	public String toString() {
		return "PointsTableInfo [teamId=" + teamId + ", teamName=" + teamName + ", matchesPlayed=" + matchesPlayed
				+ ", matchesWon=" + matchesWon + ", matchesLost=" + matchesLost + ", points=" + points + ", nrr=" + nrr
				+ "]";
	}

	
	

}

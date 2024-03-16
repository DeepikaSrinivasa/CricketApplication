package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team2 {

	private Long teamId;

	private String teamName;

	private String teamSName;

	private Long imageId;

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

	public String getTeamSName() {
		return teamSName;
	}

	public void setTeamSName(String teamSName) {
		this.teamSName = teamSName;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	@Override
	public String toString() {
		return "Team2 [teamId=" + teamId + ", teamName=" + teamName + ", teamSName=" + teamSName + ", imageId="
				+ imageId + "]";
	}
	
	

}

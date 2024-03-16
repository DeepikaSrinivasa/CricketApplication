package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team2Score {
	
	private Inning1 inngs1;

	public Inning1 getInngs1() {
		return inngs1;
	}

	public void setInngs1(Inning1 inngs1) {
		this.inngs1 = inngs1;
	}

	@Override
	public String toString() {
		return "Team2Score [inngs1=" + inngs1 + "]";
	}
	
	

}

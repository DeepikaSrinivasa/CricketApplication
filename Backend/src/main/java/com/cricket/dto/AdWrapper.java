package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdWrapper {
	
	private MatchDetails matchDetails;

	public MatchDetails getMatchDetails() {
		return matchDetails;
	}

	public void setMatchDetails(MatchDetails matchDetails) {
		this.matchDetails = matchDetails;
	}

	@Override
	public String toString() {
		return "AdWrapper [matchDetails=" + matchDetails + "]";
	}

	
	

}

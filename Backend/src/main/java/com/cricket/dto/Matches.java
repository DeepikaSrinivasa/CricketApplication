package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Matches {
	
	
	private MatchInfo matchInfo;
	
	private MatchScore matchScore;

	public MatchInfo getMatchInfo() {
		return matchInfo;
	}

	public void setMatchInfo(MatchInfo matchInfo) {
		this.matchInfo = matchInfo;
	}

	public MatchScore getMatchScore() {
		return matchScore;
	}

	public void setMatchScore(MatchScore matchScore) {
		this.matchScore = matchScore;
	}

	@Override
	public String toString() {
		return "Matches [matchInfo=" + matchInfo + ", matchScore=" + matchScore + "]";
	}
	
	
	
	
	
	

}

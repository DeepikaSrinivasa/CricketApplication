package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filters {

	private List<String> matchType;

	public List<String> getMatchType() {
		return matchType;
	}

	public void setMatchType(List<String> matchType) {
		this.matchType = matchType;
	}

	@Override
	public String toString() {
		return "Filters [matchType=" + matchType + "]";
	}

}

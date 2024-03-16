package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDetails {
	
	private String key;
	
	private List<Matches> matches;
	
	private Long seriesId;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<Matches> getMatches() {
		return matches;
	}

	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}

	public Long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
	}

	@Override
	public String toString() {
		return "MatchDetails [key=" + key + ", matches=" + matches + ", seriesId=" + seriesId + "]";
	}
	

	

}

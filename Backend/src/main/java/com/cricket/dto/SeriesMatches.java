package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SeriesMatches {
	
	private Long seriesId;
	
	private String seriesName;
	
	private List<Matches> matches;

	public Long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public List<Matches> getMatches() {
		return matches;
	}

	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "SeriesMatches [seriesId=" + seriesId + ", seriesName=" + seriesName + ", matches=" + matches + "]";
	}
	
	

}

package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeMatches {

	private String matchType;

	private List<SeriesAdWrapper> seriesAdWrapper;

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public List<SeriesAdWrapper> getSeriesAdWrapper() {
		return seriesAdWrapper;
	}

	public void setSeriesAdWrapper(List<SeriesAdWrapper> seriesAdWrapper) {
		this.seriesAdWrapper = seriesAdWrapper;
	}

	@Override
	public String toString() {
		return "TypeMatches [matchType=" + matchType + ", seriesAdWrapper=" + seriesAdWrapper + "]";
	}

}

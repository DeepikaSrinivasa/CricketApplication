package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SeriesAdWrapper {

	private SeriesMatches seriesMatches;

	public SeriesMatches getSeriesMatches() {
		return seriesMatches;
	}

	public void setSeriesMatches(SeriesMatches seriesMatches) {
		this.seriesMatches = seriesMatches;
	}

	@Override
	public String toString() {
		return "SeriesAdWrapper [seriesMatches=" + seriesMatches + "]";
	}

}

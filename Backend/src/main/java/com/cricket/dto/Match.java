package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

	private List<TypeMatches> typeMatches;

	private Filters filters;

	private AppIndex appIndex;

	private String responseLastUpdated;

	public List<TypeMatches> getTypeMatches() {
		return typeMatches;
	}

	public void setTypeMatches(List<TypeMatches> typeMatches) {
		this.typeMatches = typeMatches;
	}

	public Filters getFilters() {
		return filters;
	}

	public void setFilters(Filters filters) {
		this.filters = filters;
	}

	public AppIndex getAppIndex() {
		return appIndex;
	}

	public void setAppIndex(AppIndex appIndex) {
		this.appIndex = appIndex;
	}

	public String getResponseLastUpdated() {
		return responseLastUpdated;
	}

	public void setResponseLastUpdated(String responseLastUpdated) {
		this.responseLastUpdated = responseLastUpdated;
	}

	@Override
	public String toString() {
		return "Match [typeMatches=" + typeMatches + ", filters=" + filters + ", appIndex=" + appIndex
				+ ", responseLastUpdated=" + responseLastUpdated + "]";
	}

}

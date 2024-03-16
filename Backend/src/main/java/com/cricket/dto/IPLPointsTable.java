package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IPLPointsTable {

	private List<PointsTable> pointsTable;

	private AppIndex appIndex;

	public List<PointsTable> getPointsTable() {
		return pointsTable;
	}

	public void setPointsTable(List<PointsTable> pointsTable) {
		this.pointsTable = pointsTable;
	}

	public AppIndex getAppIndex() {
		return appIndex;
	}

	public void setAppIndex(AppIndex appIndex) {
		this.appIndex = appIndex;
	}

	@Override
	public String toString() {
		return "IPLPointsTable [pointsTable=" + pointsTable + ", appIndex=" + appIndex + "]";
	}

	

}

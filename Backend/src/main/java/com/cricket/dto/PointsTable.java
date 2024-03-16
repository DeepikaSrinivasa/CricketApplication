package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PointsTable {

	private String groupName;

	private List<PointsTableInfo> pointsTableInfo;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<PointsTableInfo> getPointsTableInfo() {
		return pointsTableInfo;
	}

	public void setPointsTableInfo(List<PointsTableInfo> pointsTableInfo) {
		this.pointsTableInfo = pointsTableInfo;
	}

	@Override
	public String toString() {
		return "PointsTable [groupName=" + groupName + ", pointsTableInfo=" + pointsTableInfo + "]";
	}

}

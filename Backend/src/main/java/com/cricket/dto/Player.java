package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
	
	private String id;
	
	private String name;
	
	private Long imageId;
	
	private String battingStyle;
	
	private String bowlingStyle;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", imageId=" + imageId + ", battingStyle=" + battingStyle
				+ ", bowlingStyle=" + bowlingStyle + "]";
	}
	
	

}

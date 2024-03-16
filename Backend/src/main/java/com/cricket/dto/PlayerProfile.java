package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerProfile {
	
	private String id;
	
	private String bat;
	
	private String name;
	
	private String nickName;
	
	private String role;
	
	private String birthPlace;
	
	private List<String> intlTeam;
	
	private List<String> teams;
	
	private String image;
	
	private String bio;
	
	private CurrentRank currRank;
	
	private AppIndex appIndex;
	
	private String faceImageId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBat() {
		return bat;
	}

	public void setBat(String bat) {
		this.bat = bat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public List<String> getIntlTeam() {
		return intlTeam;
	}

	public void setIntlTeam(List<String> intlTeam) {
		this.intlTeam = intlTeam;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	

	public CurrentRank getCurrRank() {
		return currRank;
	}

	public void setCurrRank(CurrentRank currRank) {
		this.currRank = currRank;
	}

	public AppIndex getAppIndex() {
		return appIndex;
	}

	public void setAppIndex(AppIndex appIndex) {
		this.appIndex = appIndex;
	}

	public String getFaceImageId() {
		return faceImageId;
	}

	public void setFaceImageId(String faceImageId) {
		this.faceImageId = faceImageId;
	}

	@Override
	public String toString() {
		return "PlayerProfile [id=" + id + ", bat=" + bat + ", name=" + name + ", nickName=" + nickName + ", role="
				+ role + ", birthPlace=" + birthPlace + ", intlTeam=" + intlTeam + ", teams=" + teams + ", image="
				+ image + ", bio=" + bio + ", currRank=" + currRank + ", appIndex=" + appIndex + ", faceImageId="
				+ faceImageId + "]";
	}

	


}

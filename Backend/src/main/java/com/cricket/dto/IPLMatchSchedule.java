package com.cricket.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IPLMatchSchedule {
	
	private List<AdWrapper> adWrapper;
	
	private long landingPos;
	
	private AppIndex appIndex;

	public List<AdWrapper> getAdWrapper() {
		return adWrapper;
	}

	public void setAdWrapper(List<AdWrapper> adWrapper) {
		this.adWrapper = adWrapper;
	}

	public long getLandingPos() {
		return landingPos;
	}

	public void setLandingPos(long landingPos) {
		this.landingPos = landingPos;
	}

	public AppIndex getAppIndex() {
		return appIndex;
	}

	public void setAppIndex(AppIndex appIndex) {
		this.appIndex = appIndex;
	}

	@Override
	public String toString() {
		return "IPLMatchSchedule [adWrapper=" + adWrapper + ", landingPos=" + landingPos + ", appIndex=" + appIndex
				+ "]";
	}

	
	

}

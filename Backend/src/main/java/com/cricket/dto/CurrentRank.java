package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentRank {
	
	private Bat bat;
	
	private Bowl bowl;

	public Bat getBat() {
		return bat;
	}

	public void setBat(Bat bat) {
		this.bat = bat;
	}

	public Bowl getBowl() {
		return bowl;
	}

	public void setBowl(Bowl bowl) {
		this.bowl = bowl;
	}

	@Override
	public String toString() {
		return "CurrentRank [bat=" + bat + ", bowl=" + bowl + "]";
	}
	
	

}

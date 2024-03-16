package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bat {
	
	private String testBestRank;
	
	private String odiBestRank;
	
	private String t20BestRank;

	public String getTestBestRank() {
		return testBestRank;
	}

	public void setTestBestRank(String testBestRank) {
		this.testBestRank = testBestRank;
	}

	public String getOdiBestRank() {
		return odiBestRank;
	}

	public void setOdiBestRank(String odiBestRank) {
		this.odiBestRank = odiBestRank;
	}

	public String getT20BestRank() {
		return t20BestRank;
	}

	public void setT20BestRank(String t20BestRank) {
		this.t20BestRank = t20BestRank;
	}

	@Override
	public String toString() {
		return "Bat [testBestRank=" + testBestRank + ", odiBestRank=" + odiBestRank + ", t20BestRank=" + t20BestRank
				+ "]";
	}
	
	
	
	
}

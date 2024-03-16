package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inning1 {
	
	private Long inningsId;
	
	private Long runs;
	
	private Long wickets;
	
	private Double overs;

	public Long getInningsId() {
		return inningsId;
	}

	public void setInningsId(Long inningsId) {
		this.inningsId = inningsId;
	}

	public Long getRuns() {
		return runs;
	}

	public void setRuns(Long runs) {
		this.runs = runs;
	}

	public Long getWickets() {
		return wickets;
	}

	public void setWickets(Long wickets) {
		this.wickets = wickets;
	}

	public Double getOvers() {
		return overs;
	}

	public void setOvers(Double overs) {
		this.overs = overs;
	}

	@Override
	public String toString() {
		return "Inning1 [inningsId=" + inningsId + ", runs=" + runs + ", wickets=" + wickets + ", overs=" + overs + "]";
	}
	
	

}

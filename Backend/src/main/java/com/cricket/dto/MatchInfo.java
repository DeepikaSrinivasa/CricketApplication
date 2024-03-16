package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchInfo {

	private Long matchId;

	private Long seriesId;

	private String seriesName;

	private String matchDesc;

	private String matchFormat;

	private String startDate;

	private String endDate;

	private String state;

	private String status;

	private Team1 team1;

	private Team2 team2;

	private VenueInfo venueInfo;

	private Long currentBatTeamId;

	private String seriesStartDt;

	private String seriesEndDt;

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public Long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getMatchDesc() {
		return matchDesc;
	}

	public void setMatchDesc(String matchDesc) {
		this.matchDesc = matchDesc;
	}

	public String getMatchFormat() {
		return matchFormat;
	}

	public void setMatchFormat(String matchFormat) {
		this.matchFormat = matchFormat;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Team1 getTeam1() {
		return team1;
	}

	public void setTeam1(Team1 team1) {
		this.team1 = team1;
	}

	public Team2 getTeam2() {
		return team2;
	}

	public void setTeam2(Team2 team2) {
		this.team2 = team2;
	}

	public VenueInfo getVenueInfo() {
		return venueInfo;
	}

	public void setVenueInfo(VenueInfo venueInfo) {
		this.venueInfo = venueInfo;
	}

	public Long getCurrentBatTeamId() {
		return currentBatTeamId;
	}

	public void setCurrentBatTeamId(Long currentBatTeamId) {
		this.currentBatTeamId = currentBatTeamId;
	}

	public String getSeriesStartDt() {
		return seriesStartDt;
	}

	public void setSeriesStartDt(String seriesStartDt) {
		this.seriesStartDt = seriesStartDt;
	}

	public String getSeriesEndDt() {
		return seriesEndDt;
	}

	public void setSeriesEndDt(String seriesEndDt) {
		this.seriesEndDt = seriesEndDt;
	}

	@Override
	public String toString() {
		return "MatchInfo [matchId=" + matchId + ", seriesId=" + seriesId + ", seriesName=" + seriesName
				+ ", matchDesc=" + matchDesc + ", matchFormat=" + matchFormat + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", state=" + state + ", status=" + status + ", team1=" + team1 + ", team2="
				+ team2 + ", venueInfo=" + venueInfo + ", currentBatTeamId=" + currentBatTeamId + ", seriesStartDt="
				+ seriesStartDt + ", seriesEndDt=" + seriesEndDt + "]";
	}

}

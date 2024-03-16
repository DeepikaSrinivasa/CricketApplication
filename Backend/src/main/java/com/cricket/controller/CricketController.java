package com.cricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.commons.utils.RestResponse;
import com.cricket.commons.utils.RestUtils;
import com.cricket.dto.IPLMatchSchedule;
import com.cricket.dto.IPLPointsTable;
import com.cricket.dto.Match;
import com.cricket.dto.MatchDetails;
import com.cricket.dto.Player;
import com.cricket.dto.PlayerProfile;
import com.cricket.service.CricketServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/ipl")
@Api(value = "/ipl", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, tags = {
		"IPL Api's" }, hidden = false)
@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"),
		@ApiResponse(code = 401, message = "Not Authorized"), @ApiResponse(code = 403, message = "Not Authenticated"),
		@ApiResponse(code = 404, message = "Not found"), @ApiResponse(code = 500, message = "Internal Server Error") })
public class CricketController {

	@Autowired
	private CricketServices cricketServices;

	@ApiOperation(value = "GET IPL POINTS TABLE 2023", response = IPLPointsTable.class, notes = "GET IPL POINTS TABLE 2023", httpMethod = "GET")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "GET IPL POINTS TABLE 2023", response = IPLPointsTable.class) })
	@GetMapping(path = "/points-table")
	@ResponseBody
	public ResponseEntity<RestResponse<IPLPointsTable>> fetchIplPointsTable() {
		return RestUtils.successResponse(cricketServices.fetchIplPointsTable());
	}

	@ApiOperation(value = "GET IPL FIXTURE 2023", response = MatchDetails.class, notes = "GET IPL FIXTURE 2023", httpMethod = "GET")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "GET IPL FIXTURE 2023", response = MatchDetails.class) })
	@GetMapping(path = "/match-schedules")
	@ResponseBody
	public ResponseEntity<RestResponse<List<MatchDetails>>> fetchMatchSchedule() {
		return RestUtils.successResponse(cricketServices.fetchMatchSchedule());
	}

	@ApiOperation(value = "GET IPL TEAM DETAILS 2023", response = IPLMatchSchedule.class, notes = "GET IPL TEAM DETAILS 2023", httpMethod = "GET")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "GET IPL TEAM DETAILS 2023", response = IPLMatchSchedule.class) })
	@GetMapping(path = "/team-detail/{teamId}")
	@ResponseBody
	public ResponseEntity<RestResponse<List<Player>>> getTeamDetails(@PathVariable Long teamId) {
		return RestUtils.successResponse(cricketServices.getTeamDetails(teamId));
	}

	@ApiOperation(value = "GET PLAYER DETAILS", response = IPLMatchSchedule.class, notes = "GET PLAYER DETAILS", httpMethod = "GET")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "GET PLAYER DETAILS", response = IPLMatchSchedule.class) })
	@GetMapping(path = "/player-profile/{playerId}")
	@ResponseBody
	public ResponseEntity<RestResponse<PlayerProfile>> getPlayerProfile(@PathVariable Long playerId) {
		return RestUtils.successResponse(cricketServices.getPlayerProfile(playerId));
	}

	@ApiOperation(value = "GET LIVE SCORE OF MATCH IPL 2023", response = IPLPointsTable.class, notes = "GET LIVE SCORE OF MATCH IPL 2023", httpMethod = "GET")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "GET LIVE SCORE OF MATCH IPL 2023", response = IPLPointsTable.class) })
	@GetMapping(path = "/")
	@ResponseBody
	public ResponseEntity<RestResponse<Match>> getLiveScore() {
		return RestUtils.successResponse(cricketServices.getLiveScore());
	}
}

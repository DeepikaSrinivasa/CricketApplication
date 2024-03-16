package com.cricket.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cricket.commons.logger.Logger;
import com.cricket.commons.utils.Utils;
import com.cricket.dto.AdWrapper;
import com.cricket.dto.IPLMatchSchedule;
import com.cricket.dto.IPLPointsTable;
import com.cricket.dto.Match;
import com.cricket.dto.MatchDetails;
import com.cricket.dto.Player;
import com.cricket.dto.PlayerProfile;
import com.cricket.dto.TeamDetails;

@Service
public class CricketServices {

	private Logger log = Logger.getLogger(getClass());

	@Value("${ipl.points.table.api}")
	private String iplPointsTableApi;

	@Value("${ipl.team.detail.api}")
	private String iplTeamDetailApi;

	@Value("${ipl.player.profile.api}")
	private String iplPlayerProfileApi;

	@Value("${ipl.match.schedule.api}")
	private String iplMatchScheduleApi;
	
	@Value("${ipl.live.score.api}")
	private String iplLiveScoreApi;

	@Value("${x.rapidapi.host}")
	private String host;

	@Value("${x.rapidapi.key}")
	private String key;

	private HttpHeaders generateHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-RapidAPI-Host", host);
		headers.add("X-RapidAPI-Key", key);
		return headers;
	}

	public IPLPointsTable fetchIplPointsTable() {
		RestTemplate template = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<>(generateHeaders());
		ResponseEntity<IPLPointsTable> response = template.exchange(iplPointsTableApi, HttpMethod.GET, entity,
				IPLPointsTable.class);
		return response.getBody();
	}

	public List<MatchDetails> fetchMatchSchedule() {
		RestTemplate template = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<>(generateHeaders());
		ResponseEntity<IPLMatchSchedule> response = template.exchange(iplMatchScheduleApi, HttpMethod.GET, entity,
				IPLMatchSchedule.class);

		List<MatchDetails> matchDetails = new ArrayList<>();
		if (Objects.nonNull(response)) {
			if (Utils.checkCollectionIsNotEmpty(response.getBody().getAdWrapper())) {
				for (AdWrapper schedule : response.getBody().getAdWrapper()) {
					if (Objects.nonNull(schedule.getMatchDetails())) {
						matchDetails.add(schedule.getMatchDetails());
					}
				}
			}
		}
		return matchDetails;
	}

	public List<Player> getTeamDetails(Long teamId) {

		RestTemplate template = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<>(generateHeaders());
		ResponseEntity<TeamDetails> response = template.exchange(iplTeamDetailApi + teamId, HttpMethod.GET, entity,
				TeamDetails.class);
		List<Player> players = new ArrayList<Player>();

		List<String> playerStyle = Arrays.asList("BATSMEN", "BOWLER", "WICKET KEEPER", "ALL ROUNDER");
		if (Objects.nonNull(response)) {
			if (Utils.checkCollectionIsNotEmpty(response.getBody().getPlayer())) {
				for (Player player : response.getBody().getPlayer()) {
					if (Objects.nonNull(player)) {
						if (!playerStyle.contains(player.getName())) {
							players.add(player);
						}
					}
				}
			}
		}

		return players;
	}

	public PlayerProfile getPlayerProfile(Long playerId) {
		RestTemplate template = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<>(generateHeaders());
		ResponseEntity<PlayerProfile> response = template.exchange(iplPlayerProfileApi + playerId, HttpMethod.GET,
				entity, PlayerProfile.class);
		return response.getBody();
	}

	public Match getLiveScore() {
		RestTemplate template = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<>(generateHeaders());
		ResponseEntity<Match> response = template.exchange(iplLiveScoreApi, HttpMethod.GET,
				entity, Match.class);
		return response.getBody();
	}

}

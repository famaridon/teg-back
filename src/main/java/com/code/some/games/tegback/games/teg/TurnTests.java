package com.code.some.games.tegback.games.teg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Configuration
public class TurnTests {

	@Bean
	public TurnManager turnManager() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(45, "QPE"));
		players.add(new TurnPlayer(12, "FAM"));
		players.add(new TurnPlayer(98, "PCE"));
		players.add(new TurnPlayer(32, "NHE"));
		
		return new TurnManager(players);
	}
	
}

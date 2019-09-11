package com.code.some.games.tegback.games.teg;

import com.code.some.games.tegback.games.teg.command.receiver.TEGBoard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;

@Configuration
public class TurnTests {

	@Bean
	public TEGBoard board() {
		return new TEGBoard(getFakePlayers());
	}
	
	public static LinkedList<TurnPlayer> getFakePlayers() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(45, "QPE"));
		players.add(new TurnPlayer(12, "FAM"));
		players.add(new TurnPlayer(98, "PCE"));
		players.add(new TurnPlayer(32, "NHE"));
		
		return players;
	}
}

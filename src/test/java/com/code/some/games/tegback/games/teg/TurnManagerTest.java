package com.code.some.games.tegback.games.teg;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnManagerTest {
	@Test
	void create() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(45, "QPE"));
		players.add(new TurnPlayer(12, "FAM"));
		players.add(new TurnPlayer(98, "PCE"));
		players.add(new TurnPlayer(32, "NHE"));
		
		new TurnManager(players);
	}
	
	@Test
	void firstPlayer() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(45, "QPE"));
		players.add(new TurnPlayer(12, "FAM"));
		players.add(new TurnPlayer(98, "PCE"));
		players.add(new TurnPlayer(32, "NHE"));
		
		TurnManager turnManager = new TurnManager(players);
		TurnPlayer currentPlayer = turnManager.getCurrentPlayer();
		
		assertEquals(currentPlayer.getId(),45);
	}
	
	@Test
	void nextPlayer() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(45, "QPE"));
		players.add(new TurnPlayer(12, "FAM"));
		players.add(new TurnPlayer(98, "PCE"));
		players.add(new TurnPlayer(32, "NHE"));
		
		TurnManager turnManager = new TurnManager(players);
		turnManager.endTurn();
		TurnPlayer currentPlayer = turnManager.getCurrentPlayer();
		
		assertEquals(currentPlayer.getId(),12);
	}
	
	@Test
	void lastToFirstPlayer() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(45, "QPE"));
		players.add(new TurnPlayer(12, "FAM"));
		players.add(new TurnPlayer(98, "PCE"));
		players.add(new TurnPlayer(32, "NHE"));
		
		TurnManager turnManager = new TurnManager(players);
		turnManager.endTurn();
		turnManager.endTurn();
		turnManager.endTurn();
		turnManager.endTurn();
		TurnPlayer currentPlayer = turnManager.getCurrentPlayer();
		
		assertEquals(currentPlayer.getId(),45);
	}
	
}

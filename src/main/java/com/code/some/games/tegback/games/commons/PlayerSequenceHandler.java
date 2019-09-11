package com.code.some.games.tegback.games.teg.rounds.base;

import com.code.some.games.tegback.games.teg.rounds.TurnPlayer;

import java.util.List;

public interface PlayerSequenceHandler {
	
	void nextPlayer();
	
	TurnPlayer getActivePlayer();
	
	List<TurnPlayer> getInactivePlayers();
}

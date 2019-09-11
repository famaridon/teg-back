package com.code.some.games.tegback.games.commons;

import com.code.some.games.tegback.games.teg.TurnPlayer;

import java.util.List;

public interface PlayerSequenceHandler {
	
	void nextPlayer();
	
	TurnPlayer getActivePlayer();
	
	List<TurnPlayer> getInactivePlayers();
}

package com.code.some.games.tegback.games.commons.impl;

import com.code.some.games.tegback.games.commons.PlayerSequenceHandler;
import com.code.some.games.tegback.games.teg.impl.beans.TurnPlayer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CircularPlayerSequenceHandler implements PlayerSequenceHandler {
	
	private LinkedList<TurnPlayer> playersSequence;
	
	private Iterator<TurnPlayer> playersSequenceIterator;
	
	private TurnPlayer activePlayer;
	
	public CircularPlayerSequenceHandler(LinkedList<TurnPlayer> playersSequence) {
		this.playersSequence = playersSequence;
		this.playersSequenceIterator = playersSequence.iterator();
		this.activePlayer = playersSequenceIterator.next();
	}
	
	public void nextPlayer(){
		if(!playersSequenceIterator.hasNext()) {
			playersSequenceIterator = playersSequence.iterator();
		}
		
		activePlayer = playersSequenceIterator.next();
	}
	
	@Override
	public TurnPlayer getActivePlayer() {
		return activePlayer;
	}
	
	@Override
	public List<TurnPlayer> getInactivePlayers() {
		List<TurnPlayer> inactivePlayers = playersSequence.stream()
			.filter(player -> player.getId() != activePlayer.getId())
			.collect(Collectors.toList());
		
		return inactivePlayers;
	}
}

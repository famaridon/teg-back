package com.code.some.games.tegback.games.teg;

import java.util.Iterator;
import java.util.LinkedList;

public class TurnManager {

	private LinkedList<TurnPlayer> playersSequence;
	
	private Iterator<TurnPlayer> playersSequenceIterator;
	
	private TurnPlayer currentPlayer;
	
	public TurnManager(LinkedList<TurnPlayer> playersSequence) {
		this.playersSequence = playersSequence;
		this.playersSequenceIterator = playersSequence.iterator();
		this.currentPlayer = playersSequenceIterator.next();
	}
	
	public void endTurn() {
		if(!playersSequenceIterator.hasNext()) {
			playersSequenceIterator = playersSequence.iterator();
		}
		
		currentPlayer = playersSequenceIterator.next();
	}
	
	public TurnPlayer getCurrentPlayer() {
		return currentPlayer;
	}
}

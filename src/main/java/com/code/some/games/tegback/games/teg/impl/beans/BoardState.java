package com.code.some.games.tegback.games.teg.impl.beans;

import com.code.some.games.tegback.games.teg.api.Colony;
import com.code.some.games.tegback.games.teg.api.Planet;

public class BoardState {
	
	public BoardState() {}
	
	private Colony currentPlayer;
	
	/**
	 * get {@link BoardState#currentPlayer} property
	 *
	 * @return get the currentPlayer property
	 **/
	public Colony getCurrentPlayer() {
		return currentPlayer;
	}
	
	/**
	 * set {@link BoardState#currentPlayer} property
	 *
	 * @param currentPlayer set the currentPlayer property
	 **/
	public BoardState setCurrentPlayer(Colony currentPlayer) {
		this.currentPlayer = currentPlayer;
		return this;
	}
	
	public Colony getPlayerColony(Colony colony) {
		return null;
	}
	
	public Planet getPlantet(int planetId) {
		return null;
	}
}

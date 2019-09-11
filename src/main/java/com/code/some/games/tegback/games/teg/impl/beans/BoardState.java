package com.code.some.games.tegback.games.teg.impl.beans;

public class BoardState {
	
	public BoardState() {}
	
	private TurnPlayer currentPlayer;
	
	/**
	 * get {@link BoardState#currentPlayer} property
	 *
	 * @return get the currentPlayer property
	 **/
	public TurnPlayer getCurrentPlayer() {
		return currentPlayer;
	}
	
	/**
	 * set {@link BoardState#currentPlayer} property
	 *
	 * @param currentPlayer set the currentPlayer property
	 **/
	public BoardState setCurrentPlayer(TurnPlayer currentPlayer) {
		this.currentPlayer = currentPlayer;
		return this;
	}
	
}

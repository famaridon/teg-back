package com.code.some.games.tegback.games.teg.impl.command.receiver;

import com.code.some.games.tegback.games.commons.impl.CircularPlayerSequenceHandler;
import com.code.some.games.tegback.games.teg.impl.beans.BoardState;
import com.code.some.games.tegback.games.teg.impl.beans.TurnPlayer;
import com.code.some.games.tegback.games.commons.PlayerSequenceHandler;

import java.util.Collection;
import java.util.LinkedList;

public class TEGBoard {
	
	private BoardState boardState;
	
	private PlayerSequenceHandler playerSequenceHandler;
	
	public TEGBoard(Collection playersList) {
		this.playerSequenceHandler = new CircularPlayerSequenceHandler((LinkedList<TurnPlayer>)playersList);
	}
	
	public void moveShip(){} //modify board state param : current player
	
	public void harvestEnergy(){} //get current player - modify its state
	
	public void harvestCulture(){} //get current player - modify its state
	
	public void advanceDiplomacy(){} //modify board state param : current player
	
	public void advanceEconomy(){} //modify board state param : current player
	
	public void activateColony(){} //get current player - modify its state
	
	public void resetState(){} //restore all players state + board state
	
	public void rollDices(){} //get current player - modify its state
	
	public void reRollDices(){} //get current player - modify its state
	
	public void discardDices(){ //get current player - modify its state
		playerSequenceHandler.nextPlayer();
		boardState.setCurrentPlayer(playerSequenceHandler.getActivePlayer());
	}
	
	public void followAction(){} //get some inactive player - modify its state
}

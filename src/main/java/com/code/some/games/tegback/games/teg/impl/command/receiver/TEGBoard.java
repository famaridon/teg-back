package com.code.some.games.tegback.games.teg.impl.command.receiver;

import com.code.some.games.tegback.games.commons.impl.CircularPlayerSequenceHandler;
import com.code.some.games.tegback.games.teg.api.Colony;
import com.code.some.games.tegback.games.teg.api.Planet;
import com.code.some.games.tegback.games.teg.api.PlanetType;
import com.code.some.games.tegback.games.teg.api.Ship;
import com.code.some.games.tegback.games.teg.impl.beans.BoardState;
import com.code.some.games.tegback.games.commons.PlayerSequenceHandler;

import java.util.Collection;
import java.util.LinkedList;

public class TEGBoard {
	
	private BoardState boardState;
	
	private PlayerSequenceHandler playerSequenceHandler;
	
	public TEGBoard(Collection playersList, BoardState boardState) {
		this.playerSequenceHandler = new CircularPlayerSequenceHandler((LinkedList<Colony>)playersList);
		this.boardState = boardState;
	}
	
	public Ship moveShip(int shipId, int planetId){
		Colony currentPlayer = boardState.getCurrentPlayer();
		Ship shipToMove = currentPlayer.getShip(shipId);
		Planet planet = boardState.getPlantet(planetId);
		shipToMove.travel(planet);
		
		return shipToMove;
	}
	
	public void harvestEnergy(){
		Colony currentPlayer = boardState.getCurrentPlayer();
		long energyToHarvest = currentPlayer.getShips().stream().filter(Ship::canHarvestEnergy).count();
		currentPlayer.increaseEnergy(energyToHarvest);
	} //get current player - modify its state
	
	public void harvestCulture(){
		Colony currentPlayer = boardState.getCurrentPlayer();
		long cultureToHarvest = currentPlayer.getShips().stream().filter(Ship::canHarvestCulture).count();
		currentPlayer.increaseCulture(cultureToHarvest);
	} //get current player - modify its state
	
	public void advanceDiplomacy(int shipId){
		Colony currentPlayer = boardState.getCurrentPlayer();
		Ship shipToMove = currentPlayer.getShip(shipId);
		shipToMove.progress(PlanetType.DIPLOMACY);
	} //modify board state param : current player
	
	public void advanceEconomy(int shipId){
		Colony currentPlayer = boardState.getCurrentPlayer();
		Ship shipToMove = currentPlayer.getShip(shipId);
		shipToMove.progress(PlanetType.ECONOMY);
	} //modify board state param : current player
	
	public void activateColony(){} //get current player - modify its state
	
	public void resetState(){} //restore all players state + board state
	
	public void rollDices(){
		Colony currentPlayer = boardState.getCurrentPlayer();
		currentPlayer.getDices().forEach(actionDice -> actionDice.roll());
	} //get current player - modify its state
	
	public void reRollDices(){} //get current player - modify its state
	
	public void discardDices(){ //get current player - modify its state
		boardState.setCurrentPlayer(playerSequenceHandler.nextPlayer());
	}
	
	public void followAction(){} //get some inactive player - modify its state
}

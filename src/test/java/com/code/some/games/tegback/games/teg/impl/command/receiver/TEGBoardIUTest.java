package com.code.some.games.tegback.games.teg.impl.command.receiver;

import com.code.some.games.tegback.games.teg.api.Planet;
import com.code.some.games.tegback.games.teg.api.Ship;
import com.code.some.games.tegback.games.teg.impl.beans.BoardState;
import com.code.some.games.tegback.games.teg.impl.beans.TurnPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TEGBoardIUTest {
	
	private TEGBoard board;
	
	@BeforeEach
	void setup() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(1, "QPE"));
		players.add(new TurnPlayer(2, "FAM"));
		
		this.board =  new TEGBoard(players, new BoardState()); //Définir un boardState avec des valeurs
	}
	
	@Test
	void moveShip(){
		Ship ship = board.moveShip(1, 1);
		
		assertEquals(ship.getPlanet().getId(), 1);
	}
	
	@Test
	void harvestEnergy() {
	
	}
}

package com.code.some.games.tegback.games.teg.impl.command.receiver;

import com.code.some.games.tegback.games.teg.api.Planet;
import com.code.some.games.tegback.games.teg.api.Ship;
import com.code.some.games.tegback.games.teg.impl.beans.BoardState;
import com.code.some.games.tegback.games.teg.impl.beans.TurnPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TEGBoardIUTest {
	
	private TEGBoard board;
	
	@BeforeEach
	void setup() {
		LinkedList<TurnPlayer> players = new LinkedList<>();
		players.add(new TurnPlayer(1, "QPE"));
		players.add(new TurnPlayer(2, "FAM"));
		
		this.board =  new TEGBoard(players, new BoardState());
	}
	
	@Test
	void moveShip(){
		Ship ship = mock(Ship.class);
		Planet planet = null;
		board.moveShip(1, 1);
		
		verify(ship).travel(planet);
	}
	
	@Test
	void harvestEnergy() {
	
	}
}

package com.code.some.games.tegback.games.teg.commands;

import com.code.some.games.tegback.games.teg.TEGBoard;

public class MoveShip implements Command {
	protected TEGBoard board;
	
	public MoveShip(TEGBoard board) { this.board = board;}
	
	@Override
	public void execute() {
	}
	
	@Override
	public void undo() {
		board.resetState();
	}
	
}

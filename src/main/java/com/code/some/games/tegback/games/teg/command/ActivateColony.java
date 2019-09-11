package com.code.some.games.tegback.games.teg.commands;

import com.code.some.games.tegback.games.teg.TEGBoard;

public class ActivateColony implements Command {
	protected TEGBoard board;
	
	public ActivateColony(TEGBoard board) { this.board = board;}
	
	@Override
	public void execute() {
	}
	
	@Override
	public void undo() {
		board.resetState();
	}
	
}

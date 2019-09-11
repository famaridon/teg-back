package com.code.some.games.tegback.games.teg.commands;

import com.code.some.games.tegback.games.teg.TEGBoard;

public class DiscardDices implements Command {
	protected TEGBoard board;
	
	public DiscardDices(TEGBoard board) { this.board = board;}
	
	@Override
	public void execute() {
		board.discardDices();
	}
	
	@Override
	public void undo() {
		board.resetState();
	}
}
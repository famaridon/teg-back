package com.code.some.games.tegback.games.teg.impl.command;

import com.code.some.games.tegback.games.teg.api.Command;
import com.code.some.games.tegback.games.teg.impl.command.receiver.TEGBoard;

public class RollDices implements Command {
	protected TEGBoard board;
	
	public RollDices(TEGBoard board) { this.board = board;}
	
	@Override
	public void execute() {
		board.rollDices();
	}
	
	@Override
	public void undo() {
		board.resetState();
	}
}

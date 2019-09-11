package com.code.some.games.tegback.games.teg.command;

import com.code.some.games.tegback.games.teg.command.base.Command;
import com.code.some.games.tegback.games.teg.command.receiver.TEGBoard;

public class AdvanceEconomy implements Command {
	protected TEGBoard board;
	
	public AdvanceEconomy(TEGBoard board) { this.board = board;}
	
	@Override
	public void execute() {
	}
	
	@Override
	public void undo() {
		board.resetState();
	}
	
}

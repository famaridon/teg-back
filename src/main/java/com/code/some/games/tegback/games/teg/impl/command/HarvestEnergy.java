package com.code.some.games.tegback.games.teg.impl.command;

import com.code.some.games.tegback.games.teg.api.Command;
import com.code.some.games.tegback.games.teg.impl.command.receiver.TEGBoard;

public class HarvestEnergy implements Command {
	protected TEGBoard board;
	
	public HarvestEnergy(TEGBoard board) { this.board = board;}
	
	@Override
	public void execute() {
	}
	
	@Override
	public void undo() {
		board.resetState();
	}
	
}

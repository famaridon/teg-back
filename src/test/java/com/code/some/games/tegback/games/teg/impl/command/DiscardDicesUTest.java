package com.code.some.games.tegback.games.teg.impl.command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.code.some.games.tegback.games.teg.impl.command.receiver.TEGBoard;
import org.junit.jupiter.api.Test;

class DiscardDicesUTest {

  @Test
  void execute() {
    TEGBoard tegBoard = mock(TEGBoard.class);
    DiscardDices discardDices = new DiscardDices(tegBoard);
    discardDices.execute();
    verify(tegBoard).discardDices();
  }

  @Test
  void undo() {
    TEGBoard tegBoard = mock(TEGBoard.class);
    DiscardDices discardDices = new DiscardDices(tegBoard);
    discardDices.execute();
    verify(tegBoard).resetState();
  }

}
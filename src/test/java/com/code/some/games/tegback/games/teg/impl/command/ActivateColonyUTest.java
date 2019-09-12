package com.code.some.games.tegback.games.teg.impl.command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.code.some.games.tegback.games.teg.impl.command.receiver.TEGBoard;
import org.junit.jupiter.api.Test;

class ActivateColonyUTest {

  @Test
  void execute() {
    TEGBoard tegBoard = mock(TEGBoard.class);
    ActivateColony activateColony = new ActivateColony(tegBoard);
    activateColony.execute();
    verify(tegBoard).activateColony();
  }

}
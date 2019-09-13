package com.code.some.games.tegback.games.commons.impl;

import com.code.some.games.tegback.games.commons.PlayerSequenceHandler;
import com.code.some.games.tegback.games.teg.api.Colony;
import java.util.Queue;

public class CircularPlayerSequenceHandler implements PlayerSequenceHandler {

  private Queue<Colony> playersSequence;

  public CircularPlayerSequenceHandler(Queue<Colony> playersSequence) {
    this.playersSequence = playersSequence;
  }

  public Colony nextPlayer() {
    Colony currentPlayer =  playersSequence.poll();
    playersSequence.add(currentPlayer);
    
    return playersSequence.peek();
  }

}

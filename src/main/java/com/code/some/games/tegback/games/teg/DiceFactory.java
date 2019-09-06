package com.code.some.games.tegback.games.teg;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.commons.impl.StaticDice;
import java.util.Arrays;

public class DiceFactory {

  public Dice<Action> create() {
    return new StaticDice<>(Arrays.asList(Action.values()));
  }

}

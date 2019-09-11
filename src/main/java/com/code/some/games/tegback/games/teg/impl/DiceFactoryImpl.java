package com.code.some.games.tegback.games.teg.impl;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.commons.impl.StaticDice;
import com.code.some.games.tegback.games.teg.api.Action;
import com.code.some.games.tegback.games.teg.api.DiceFactory;
import java.util.Arrays;

public class DiceFactoryImpl implements DiceFactory {

  @Override
  public Dice<Action> create() {
    return new StaticDice<>(Arrays.asList(Action.values()));
  }

}

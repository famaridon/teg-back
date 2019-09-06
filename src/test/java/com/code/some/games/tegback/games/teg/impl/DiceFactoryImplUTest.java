package com.code.some.games.tegback.games.teg.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.api.Action;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class DiceFactoryImplUTest {

  @Test
  void create() {
    new DiceFactoryImpl();
  }

  @Test
  void createDice() {
    DiceFactoryImpl factory = new DiceFactoryImpl();
    Dice<Action> dice = factory.create();
    assertEquals(Arrays.asList(Action.values()),dice.list());
  }
}
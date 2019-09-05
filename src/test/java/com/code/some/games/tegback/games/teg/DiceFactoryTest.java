package com.code.some.games.tegback.games.teg;

import static org.junit.jupiter.api.Assertions.*;

import com.code.some.games.tegback.games.commons.Dice;
import org.junit.jupiter.api.Test;

class DiceFactoryTest {

  @Test
  void create() {
    new DiceFactory();
  }

  @Test
  void createDice() {
    DiceFactory factory = new DiceFactory();
    Dice dice = factory.create();
    assertNotNull(dice);
  }
}
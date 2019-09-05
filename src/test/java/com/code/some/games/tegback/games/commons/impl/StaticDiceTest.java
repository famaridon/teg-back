package com.code.some.games.tegback.games.commons.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class StaticDiceTest {

  @Test
  void create() {
    new StaticDice<>(Arrays.asList(1, 2, 3, 4, 5, 6));
  }

  @Test
  void createOneFace() {
    assertThrows(IllegalArgumentException.class, () -> new StaticDice<>(Arrays.asList(1)),
        "Dice should have at leas 2 faces.");
  }

  @Test
  void roll() {
    StaticDice<Integer> sixFaceDice = new StaticDice<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    assertTrue(Arrays.asList(1, 2, 3, 4, 5, 6).contains(sixFaceDice.roll()));
  }
}
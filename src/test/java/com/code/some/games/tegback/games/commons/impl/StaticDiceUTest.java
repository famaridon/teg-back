package com.code.some.games.tegback.games.commons.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class StaticDiceUTest {

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

  @Test
  void list() {
    List<Integer> faces = Arrays.asList(1, 2);
    StaticDice<Integer> coin = new StaticDice<>(faces);
    assertEquals(faces.get(0), coin.list().get(0));
    assertEquals(faces.get(1), coin.list().get(1));
  }
}
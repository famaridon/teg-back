package com.code.some.games.tegback.games.commons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoundedNumberUTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void createNullValue() {
    assertThrows(NullPointerException.class, () -> new BoundedNumber<Integer>(null, 0, 100));
  }

  @Test
  void get() {
    BoundedNumber<Integer> boundedNumber = new BoundedNumber<>(1, 0, 100);
    assertNotNull(boundedNumber.get());
    assertEquals(Integer.valueOf(1), boundedNumber.get());
  }

  @Test
  void update() {
    BoundedNumber<Integer> boundedNumber = new BoundedNumber<>(1, 0, 100);
    assertEquals(Integer.valueOf(1), boundedNumber.get());
    boundedNumber.update(2);
    assertEquals(Integer.valueOf(2), boundedNumber.get());
  }

  @Test
  void lowerBoundException() {
    assertThrows(IllegalArgumentException.class, () -> new BoundedNumber<>(-1, 0, 100));
  }

  @Test
  void upperBoundException() {
    assertThrows(IllegalArgumentException.class, () -> new BoundedNumber<>(101, 0, 100));
  }

}
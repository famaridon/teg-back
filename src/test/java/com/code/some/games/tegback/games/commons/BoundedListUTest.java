package com.code.some.games.tegback.games.commons;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BoundedListUTest {

  @Test
  void create() {
    new BoundedList<>(Arrays.asList(1, 2, 3, 4), 3, 10);
  }

  @Test
  void createToSmall() {
    assertThrows(IllegalArgumentException.class,
        () -> new BoundedList<>(Arrays.asList(1, 2), 3, 10));
  }

  @Test
  void createToLarge() {
    assertThrows(IllegalArgumentException.class,
        () -> new BoundedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 3, 4));
  }

  @Test
  void addTooLarge() {
    assertThrows(IllegalArgumentException.class, () -> {
      BoundedList<Integer> list = new BoundedList<>(Arrays.asList(1, 2, 3, 4), 3, 4);
      list.add(5);
    });
  }

  @Test
  void addAllTooLarge() {
    assertThrows(IllegalArgumentException.class, () -> {
      BoundedList<Integer> list = new BoundedList<>(Arrays.asList(1, 2, 3, 4), 3, 4);
      list.addAll(Arrays.asList(5, 6, 7));
    });
  }

  @Test
  void removeTooSmall() {
    assertThrows(IllegalArgumentException.class, () -> {
      BoundedList<Integer> list = new BoundedList<>(Arrays.asList(1, 2, 3), 3, 4);
      list.remove(2);
    });
  }

  @Test
  void removeAllTooSmall() {
    assertThrows(IllegalArgumentException.class, () -> {
      BoundedList<Integer> list = new BoundedList<>(Arrays.asList(1, 2, 3, 4), 3, 4);
      list.removeAll(Arrays.asList(1, 2, 3, 4));
    });
  }


}
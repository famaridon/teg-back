package com.code.some.games.tegback.games.commons.impl;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

import com.code.some.games.tegback.games.commons.Dice;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StaticDice<T> implements Dice<T> {

  private final List<T> faces;
  private final Random roller;

  public StaticDice(List<T> faces) {
    faces = notNull(faces);
    isTrue(faces.size() > 1);
    this.faces = Collections.unmodifiableList(faces);
    this.roller = new Random();
  }

  public T roll() {
    return faces.get(this.roller.nextInt(this.faces.size()));
  }

}

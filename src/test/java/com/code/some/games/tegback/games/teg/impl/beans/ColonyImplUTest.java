package com.code.some.games.tegback.games.teg.impl.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColonyImplUTest {

  private ColonyImpl colonyImpl;

  @BeforeEach
  public void setup() {
    this.colonyImpl = new ColonyImplBuilder()
        .setLevel(1)
        .setEnergy(2)
        .setCulture(1)
        .setDices(new ArrayList<>())
        .setShips(new ArrayList<>())
        .build();
  }

  @Test
  public void create() {
    assertNotNull(this.colonyImpl);
    assertEquals(Integer.valueOf(1), this.colonyImpl.getCulture());
    assertEquals(Integer.valueOf(2), this.colonyImpl.getEnergy());
    assertEquals(0, this.colonyImpl.getDices().size());
    assertEquals(0, this.colonyImpl.getShips().size());
  }

  @Test
  public void dicesIsUnmodifiable() {
    assertThrows(UnsupportedOperationException.class, () -> this.colonyImpl.getDices().add(null),
        "Dices should not be modifiable");

  }

  @Test
  public void shipsIsUnmodifiable() {
    assertThrows(UnsupportedOperationException.class, () -> this.colonyImpl.getShips().add(null),
        "Dices should not be modifiable");
  }

  @Test
  public void validLevel() {
    this.colonyImpl.validLevel(1);
    this.colonyImpl.validLevel(2);
    this.colonyImpl.validLevel(3);
    this.colonyImpl.validLevel(4);
    this.colonyImpl.validLevel(5);
    this.colonyImpl.validLevel(6);
  }

  @Test
  public void notValidLevel() {
    assertThrows(NullPointerException.class, () -> this.colonyImpl.validLevel(null));
    assertThrows(IllegalArgumentException.class, () -> this.colonyImpl.validLevel(0),
        "Minimum level is 1");
    assertThrows(IllegalArgumentException.class, () -> this.colonyImpl.validLevel(7),
        "Maximum level is 6");
  }

}
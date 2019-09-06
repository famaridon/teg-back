package com.code.some.games.tegback.games.teg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColonyTest {

  private Colony colony;

  @BeforeEach
  public void setup(){
    this.colony = new Colony(2, 1, new ArrayList<>(), new ArrayList<>());
  }

  @Test
  public void create() {
    assertNotNull(this.colony);
    assertEquals(Integer.valueOf(1), this.colony.getCulture());
    assertEquals(Integer.valueOf(2), this.colony.getEnergy());
    assertEquals(0, this.colony.getDices().size());
    assertEquals(0, this.colony.getShips().size());
  }

  @Test
  public void dicesIsUnmodifiable() {
    assertThrows(UnsupportedOperationException.class, () -> this.colony.getDices().add(null), "Dices should not be modifiable");

  }

  @Test
  public void shipsIsUnmodifiable() {
    assertThrows(UnsupportedOperationException.class, () -> this.colony.getShips().add(null), "Dices should not be modifiable");
  }

}
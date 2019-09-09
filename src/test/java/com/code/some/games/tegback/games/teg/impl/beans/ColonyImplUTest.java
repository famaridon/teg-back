package com.code.some.games.tegback.games.teg.impl.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.code.some.games.tegback.games.teg.impl.ColonyFactoryImpl;
import com.code.some.games.tegback.games.teg.impl.DiceFactoryImpl;
import com.code.some.games.tegback.games.teg.impl.ShipFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColonyImplUTest {

  private ColonyImpl colonyImpl;

  @BeforeEach
  void setup() {
    this.colonyImpl = (ColonyImpl) new ColonyFactoryImpl(new DiceFactoryImpl(),
        new ShipFactoryImpl()).create();
  }

  @Test
  void create() {
    assertNotNull(this.colonyImpl);
    assertEquals(Integer.valueOf(1), this.colonyImpl.getCulture());
    assertEquals(Integer.valueOf(2), this.colonyImpl.getEnergy());
    assertEquals(4, this.colonyImpl.getDices().size());
    assertEquals(2, this.colonyImpl.getShips().size());
  }

  @Test
  void dicesIsUnmodifiable() {
    assertThrows(UnsupportedOperationException.class, () -> this.colonyImpl.getDices().add(null),
        "Dices should not be modifiable");

  }

  @Test
  void shipsIsUnmodifiable() {
    assertThrows(UnsupportedOperationException.class, () -> this.colonyImpl.getShips().add(null),
        "Dices should not be modifiable");
  }

}
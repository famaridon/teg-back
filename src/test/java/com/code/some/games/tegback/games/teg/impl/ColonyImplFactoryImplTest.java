package com.code.some.games.tegback.games.teg.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.code.some.games.tegback.games.teg.api.Colony;
import com.code.some.games.tegback.games.teg.api.DiceFactory;
import com.code.some.games.tegback.games.teg.api.ShipFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColonyImplFactoryImplTest {

  private ColonyFactoryImpl factory;
  private DiceFactory diceFactory = new DiceFactoryImpl();
  private ShipFactory shipFactory = new ShipFactoryImpl();

  @BeforeEach
  public void setup(){
    this.factory = new ColonyFactoryImpl(diceFactory, shipFactory);
  }

  @Test
  void createColony() {
    Colony colony = this.factory.create();
    assertNotNull(colony);
    assertEquals(1, colony.getCulture().intValue(), "Colony start with 1 culture");
    assertEquals(2, colony.getEnergy().intValue(), "Colony start with 2 energies");
    assertEquals(4, colony.getDices().size(), "Colony start with 4 dices");
    assertEquals(2, colony.getShips().size(), "Colony start with 2 ships");
  }
}
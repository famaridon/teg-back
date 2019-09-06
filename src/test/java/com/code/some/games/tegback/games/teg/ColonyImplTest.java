package com.code.some.games.tegback.games.teg;

import static org.junit.jupiter.api.Assertions.*;

import com.code.some.games.tegback.games.teg.impl.beans.ColonyImpl;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColonyImplTest {

  private ColonyImpl colonyImpl;

  @BeforeEach
  public void setup() {
    this.colonyImpl = new ColonyImpl(2, 1, new ArrayList<>(), new ArrayList<>());
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

}
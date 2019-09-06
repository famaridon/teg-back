package com.code.some.games.tegback.games.teg.api;

import com.code.some.games.tegback.games.commons.Dice;
import java.util.List;

public interface Colony {

  public Integer getEnergy();

  public Integer getCulture();

  public List<Dice<Action>> getDices();

  public List<Ship> getShips();
}

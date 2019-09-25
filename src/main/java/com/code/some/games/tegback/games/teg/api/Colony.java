package com.code.some.games.tegback.games.teg.api;

import com.code.some.games.tegback.games.commons.Dice;
import java.util.List;

public interface Colony {

  Integer getEnergy();

  Integer getCulture();

  List<Dice<Action>> getDices();

  List<Ship> getShips();

  Integer getLevel();
  
  void increaseEnergy(long energyToHarvest);
  
  void increaseCulture(long cultureToHarvest);
  
  Ship getShip(int shipId);
}

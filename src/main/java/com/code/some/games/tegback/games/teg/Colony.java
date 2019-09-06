package com.code.some.games.tegback.games.teg;

import com.code.some.games.tegback.games.commons.Dice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colony {

  public static final int MAX_DICES = 7;
  public static final int MIN_DICES = 4;
  public static final int MIN_SHIPS = 2;
  public static final int MAX_SHIPS = 4;

  private Integer energy;
  private Integer culture;
  private List<Dice<Action>> dices;
  private List<Ship> ships;

  public Colony(Integer energy, Integer culture,
      List<Dice<Action>> dices, List<Ship> ships) {
    this.energy = energy;
    this.culture = culture;
    this.dices = new ArrayList<>(dices);
    this.ships = new ArrayList<>(ships);
  }

  public Integer getEnergy() {
    return energy;
  }

  public Integer getCulture() {
    return culture;
  }

  public List<Dice<Action>> getDices() {
    return Collections.unmodifiableList(this.dices);
  }

  public List<Ship> getShips() {
    return Collections.unmodifiableList(this.ships);
  }
}

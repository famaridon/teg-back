package com.code.some.games.tegback.games.teg.impl.beans;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.api.Action;
import com.code.some.games.tegback.games.teg.api.Colony;
import com.code.some.games.tegback.games.teg.api.Ship;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColonyImpl implements Colony {

  public static final int MAX_DICES = 7;
  public static final int MIN_DICES = 4;

  public static final int MIN_SHIPS = 2;
  public static final int MAX_SHIPS = 4;

  private Integer level;
  private Integer energy;
  private Integer culture;
  private List<Dice<Action>> dices;
  private List<Ship> ships;

  protected ColonyImpl(Integer level, Integer energy, Integer culture,
      List<Dice<Action>> dices, List<Ship> ships) {
    this.level = level;
    this.energy = energy;
    this.culture = culture;
    this.dices = new ArrayList<>(dices);
    this.ships = new ArrayList<>(ships);
  }

  @Override
  public Integer getEnergy() {
    return energy;
  }

  @Override
  public Integer getCulture() {
    return culture;
  }

  @Override
  public List<Dice<Action>> getDices() {
    return Collections.unmodifiableList(this.dices);
  }

  @Override
  public List<Ship> getShips() {
    return Collections.unmodifiableList(this.ships);
  }

  @Override
  public Integer getLevel() {
    return level;
  }
}

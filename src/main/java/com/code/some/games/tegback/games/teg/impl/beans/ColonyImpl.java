package com.code.some.games.tegback.games.teg.impl.beans;

import com.code.some.games.tegback.games.commons.BoundedNumber;
import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.api.Action;
import com.code.some.games.tegback.games.teg.api.Colony;
import com.code.some.games.tegback.games.teg.api.Ship;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColonyImpl implements Colony {

  public static final int MIN_LEVEL = 1;
  public static final int MAX_LEVEL = 6;
  private static final int MIN_ENERGY = 0;
  private static final int MAX_ENERGY = 7;
  private static final int MIN_CULTURE = 0;
  private static final int MAX_CULTURE = 7;

  public static final int MIN_DICES = 4;
  public static final int MAX_DICES = 7;

  public static final int MIN_SHIPS = 2;
  public static final int MAX_SHIPS = 4;

  private final BoundedNumber<Integer> level;
  private final BoundedNumber<Integer> energy;
  private final BoundedNumber<Integer> culture;
  private List<Dice<Action>> dices;
  private List<Ship> ships;

  protected ColonyImpl(Integer level, Integer energy, Integer culture,
      List<Dice<Action>> dices, List<Ship> ships) {
    this.level = new BoundedNumber<>(level, MIN_LEVEL, MAX_LEVEL);
    this.energy = new BoundedNumber<>(energy, MIN_ENERGY, MAX_ENERGY);
    this.culture = new BoundedNumber<>(culture, MIN_CULTURE, MAX_CULTURE);
    this.dices = new ArrayList<>(dices);
    this.ships = new ArrayList<>(ships);
  }

  @Override
  public Integer getEnergy() {
    return energy.get();
  }

  @Override
  public Integer getCulture() {
    return culture.get();
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
    return level.get();
  }

}

package com.code.some.games.tegback.games.teg.impl.beans;

import static org.apache.commons.lang3.Validate.notNull;

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

  public static final int MIN_DICES = 4;
  public static final int MAX_DICES = 7;

  public static final int MIN_SHIPS = 2;
  public static final int MAX_SHIPS = 4;

  private Integer level;
  private Integer energy;
  private Integer culture;
  private List<Dice<Action>> dices;
  private List<Ship> ships;

  protected ColonyImpl(Integer level, Integer energy, Integer culture,
      List<Dice<Action>> dices, List<Ship> ships) {
    this.level = this.validLevel(level);
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

  final Integer validLevel(Integer level) {
    level = notNull(level);

    if (level < MIN_LEVEL || level > MAX_LEVEL) {
      throw new IllegalArgumentException("Level bounds are 1 to 6!");
    }

    return level;
  }
}

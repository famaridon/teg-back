package com.code.some.games.tegback.games.teg.impl.beans;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.api.Action;
import com.code.some.games.tegback.games.teg.api.Ship;
import java.util.List;

public class ColonyImplBuilder {

  private Integer level;
  private Integer energy;
  private Integer culture;
  private List<Dice<Action>> dices;
  private List<Ship> ships;

  public ColonyImplBuilder setEnergy(Integer energy) {
    this.energy = energy;
    return this;
  }

  public ColonyImplBuilder setCulture(Integer culture) {
    this.culture = culture;
    return this;
  }

  public ColonyImplBuilder setDices(List<Dice<Action>> dices) {
    this.dices = dices;
    return this;
  }

  public ColonyImplBuilder setShips(List<Ship> ships) {
    this.ships = ships;
    return this;
  }

  public ColonyImplBuilder setLevel(Integer level) {
    this.level = level;
    return this;
  }

  public ColonyImpl build() {
    return new ColonyImpl(level, energy, culture, dices, ships);
  }
}
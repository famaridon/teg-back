package com.code.some.games.tegback.games.teg.impl;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.api.Action;
import com.code.some.games.tegback.games.teg.api.Colony;
import com.code.some.games.tegback.games.teg.api.ColonyFactory;
import com.code.some.games.tegback.games.teg.api.DiceFactory;
import com.code.some.games.tegback.games.teg.api.Ship;
import com.code.some.games.tegback.games.teg.api.ShipFactory;
import com.code.some.games.tegback.games.teg.impl.beans.ColonyImpl;
import com.code.some.games.tegback.games.teg.impl.beans.ShipImpl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.Validate;

public class ColonyFactoryImpl implements ColonyFactory {

  private final DiceFactory diceFactory;
  private final ShipFactory shipFactory;

  public ColonyFactoryImpl(DiceFactory diceFactory,
      ShipFactory shipFactory) {
    this.diceFactory = Validate.notNull(diceFactory);
    this.shipFactory = Validate.notNull(shipFactory);
  }

  public Colony create() {
    List<Dice<Action>> dices = Stream.iterate(0, i -> i + 1)
        .limit(ColonyImpl.MIN_DICES)
        .map((i) -> this.diceFactory.create())
        .collect(Collectors.toList());


    List<Ship> ships = Stream.iterate(0, i -> i + 1)
        .limit(ColonyImpl.MIN_SHIPS)
        .map((i) -> this.shipFactory.create())
        .collect(Collectors.toList());

    return new ColonyImpl(2,1, dices, ships);
  }

}

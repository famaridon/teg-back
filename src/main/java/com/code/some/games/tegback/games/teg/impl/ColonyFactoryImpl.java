package com.code.some.games.tegback.games.teg.impl;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.Action;
import com.code.some.games.tegback.games.teg.Colony;
import com.code.some.games.tegback.games.teg.ColonyFactory;
import com.code.some.games.tegback.games.teg.DiceFactory;
import com.code.some.games.tegback.games.teg.Ship;
import com.code.some.games.tegback.games.teg.ShipFactory;
import java.util.ArrayList;
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
        .limit(Colony.MAX_DICES)
        .map((i) -> this.diceFactory.create())
        .collect(Collectors.toList());


    List<Ship> ships = Stream.iterate(0, i -> i + 1)
        .limit(Colony.MIN_SHIPS)
        .map((i) -> this.shipFactory.create())
        .collect(Collectors.toList());

    return new Colony(2,1, dices, ships);
  }

}

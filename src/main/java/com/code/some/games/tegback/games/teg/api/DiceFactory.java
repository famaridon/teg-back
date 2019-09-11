package com.code.some.games.tegback.games.teg.api;

import com.code.some.games.tegback.games.commons.Dice;

public interface DiceFactory {

  Dice<Action> create();
}

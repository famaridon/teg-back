package com.code.some.games.tegback.games.teg.api;

import com.code.some.games.tegback.games.commons.Dice;
import com.code.some.games.tegback.games.teg.api.Action;

public interface DiceFactory {

  Dice<Action> create();
}

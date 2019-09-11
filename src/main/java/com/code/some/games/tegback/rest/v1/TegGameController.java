package com.code.some.games.tegback.rest.v1;

import com.code.some.games.tegback.games.teg.rounds.TurnManager;
import com.code.some.games.tegback.games.teg.TurnPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "teg")
public class TegGameController {
  
  @Autowired
  private ApplicationContext appContext;

  @GetMapping(path = "ping")
  public String ping(){
    return "{\"result\":\"pong\"}";
  }

  @GetMapping(path = "hello")
  public String hello(){
    TurnManager turnManager = (TurnManager)appContext.getBean("turnManager");
    TurnPlayer activePlayer = turnManager.getActivePlayer();
    return Integer.toString(activePlayer.getId());
  }

}

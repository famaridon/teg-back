package com.code.some.games.tegback.rest.v1;

import com.code.some.games.tegback.games.teg.TurnManager;
import com.code.some.games.tegback.games.teg.TurnPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WSRoomController {
  
  @Autowired
  private ApplicationContext appContext;

  @MessageMapping("/events/play")
  @SendTo("/events/update")
  public String play(String message) throws Exception {
    return "pong";
  }
  
  @MessageMapping("/events/endTurn")
  @SendTo("/events/update")
  public String endTurn(String message) throws Exception {
    TurnManager turnManager = (TurnManager)appContext.getBean("turnManager");
    turnManager.endTurn();
    TurnPlayer currentPlayer = turnManager.getCurrentPlayer();
  
    return "next player : " + currentPlayer.getId();
  }
  

}

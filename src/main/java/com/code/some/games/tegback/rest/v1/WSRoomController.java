package com.code.some.games.tegback.rest.v1;

import com.code.some.games.tegback.games.teg.CommandFactory;
import com.code.some.games.tegback.games.teg.api.Action;
import com.code.some.games.tegback.games.teg.command.base.Command;
import com.code.some.games.tegback.games.teg.command.receiver.TEGBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WSRoomController {
  
  @Autowired
  private ApplicationContext appContext;
  
  @MessageMapping("/events/play")
  @SendTo("/events/update/action")
  public String play(String message) throws Exception {
    TEGBoard board = (TEGBoard)appContext.getBean("board");
    Command selectedCommand = CommandFactory.getCommand(Action.ACTIVATE_COLONY, board);
    
    selectedCommand.execute();
    
    return null;
  }
}

package com.code.some.games.tegback.rest.v1;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WSRoomController {

  @MessageMapping("/events/play")
  @SendTo("/events/update")
  public String play(String message) throws Exception {
    return "pong";
  }

}

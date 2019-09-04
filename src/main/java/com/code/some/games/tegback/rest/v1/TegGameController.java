package com.code.some.games.tegback.rest.v1;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "teg")
public class TegGameController {

  @GetMapping(path = "ping")
  public String ping(){
    return "{\"result\":\"pong\"}";
  }

  @MessageMapping("/events/play")
  @SendTo("/events/update")
  public String play(String message) throws Exception {
    return "ping";
  }

}

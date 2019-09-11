package com.code.some.games.tegback.rest.v1;

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

}

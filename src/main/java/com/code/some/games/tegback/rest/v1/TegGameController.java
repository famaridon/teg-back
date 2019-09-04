package com.code.some.games.tegback.rest.v1;

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

  @GetMapping(path = "hello")
  public String hello(){
    return "{\"result\":\"hello\"}";
  }

}

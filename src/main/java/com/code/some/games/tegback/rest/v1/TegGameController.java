package com.code.some.games.tegback.rest.v1;

import com.code.some.games.tegback.games.teg.api.Room;
import com.code.some.games.tegback.games.teg.api.RoomFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "teg")
public class TegGameController {
  
  @Autowired
  private RoomFactory roomFactory;
  
  @Autowired
  private ApplicationContext appContext;

  @GetMapping(path = "ping")
  public String ping(){
    return "{\"result\":\"pong\"}";
  }
  
  @GetMapping(path = "rooms")
  public String getRooms(){
    Map<Integer, Room> rooms = roomFactory.getRooms();
    String roomsJSon = null;
    
    try {
      ObjectMapper mapper = new ObjectMapper();
      roomsJSon = mapper.writeValueAsString(rooms.values());
    }
    catch (JsonProcessingException e) {
      // TODO : Add message
    }
    
    return  roomsJSon;
  }
  
  @PostMapping(path = "room")
  public String createRoom(@RequestParam(value="roomName") String roomName){
    Room room = roomFactory.create(roomName);
    String roomJSon = null;
  
    try {
      ObjectMapper mapper = new ObjectMapper();
      roomJSon = mapper.writeValueAsString(room);
    }
    catch (JsonProcessingException e) {
      // TODO : Add message
    }
    return roomJSon;
  }
  
  @GetMapping(path = "room/{roomId}")
  public String getRoom(@PathVariable int roomId){
    Room room = roomFactory.getRoom(roomId);
    String roomJSon = null;
  
    try {
      ObjectMapper mapper = new ObjectMapper();
      roomJSon = mapper.writeValueAsString(room);
    }
    catch (JsonProcessingException e) {
      // TODO : Add message
    }
    return roomJSon;
  }

}

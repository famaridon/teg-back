package com.code.some.games.tegback.games.teg.impl;

import com.code.some.games.tegback.games.teg.api.Room;
import com.code.some.games.tegback.games.teg.api.RoomFactory;
import com.code.some.games.tegback.games.teg.impl.beans.RoomImpl;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RoomFactoryImpl implements RoomFactory {
	
	private static Map<Integer, Room> rooms = new HashMap<>();
	
	public RoomFactoryImpl() {
	}
	
	@Override
	public Room create(String name) {
		int newId = rooms.size() + 1;
		Room newRoom = new RoomImpl(newId, name);
		rooms.put(newId, newRoom);
		
		return newRoom;
	}
	
	@Override
	public Map<Integer, Room> getRooms() {
		return rooms;
	}
	
	@Override
	public Room getRoom(int id) {
		return rooms.get(id);
	}
}

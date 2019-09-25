package com.code.some.games.tegback.games.teg.api;

import java.util.Map;

public interface RoomFactory {
	public Room create(String name);
	public Map<Integer, Room> getRooms();
	public Room getRoom(int id);
}

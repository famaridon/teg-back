package com.code.some.games.tegback.games.teg.impl.beans;

import com.code.some.games.tegback.games.teg.api.Room;

public class RoomImpl implements Room {
	
	private String name;
	
	private int id;
	
	public RoomImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getId() {
		return id;
	}
}

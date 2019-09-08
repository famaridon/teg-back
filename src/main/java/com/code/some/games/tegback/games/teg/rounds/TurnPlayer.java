package com.code.some.games.tegback.games.teg;

public class TurnPlayer {
	
	private int id;
	
	private String nickname;
	
	public TurnPlayer(int id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}
	
	/**
	 * get {@link TurnPlayer#id} property
	 *
	 * @return get the id property
	 **/
	public int getId() {
		return id;
	}
}

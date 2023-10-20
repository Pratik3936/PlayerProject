package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	private int playerId;
	
	private String playerName;
	private String playerType;
	public Player(int playerId, String playerName, String playerType) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerType = playerType;
	}
	public Player() {
		super();
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerType=" + playerType + "]";
	}
	
	
	

}

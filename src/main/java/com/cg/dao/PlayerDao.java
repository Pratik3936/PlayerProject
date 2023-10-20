package com.cg.dao;

import java.util.List;

import com.cg.entity.Player;

public interface PlayerDao {
	
	String addPlayer (Player player);
	List<Player> getAll();

}

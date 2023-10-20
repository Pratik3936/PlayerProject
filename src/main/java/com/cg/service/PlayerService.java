package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.PlayerDao;
import com.cg.entity.Player;
import com.cg.repository.PlayerRepository;

@Service
public class PlayerService implements PlayerDao{
	
	@Autowired
	PlayerRepository playerrepo;

	@Override
	public String addPlayer(Player player) {
		
		   playerrepo.save(player);
		
		return "Player added successfully";
	}

	@Override
	public List<Player> getAll() {
		
		return playerrepo.findAll();
	}
	
	

}

package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Player;
import com.cg.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService service;
	
	@PostMapping("/add")
	public String addPlayer(@RequestBody Player player) {
		
		service.addPlayer(player);
		return "Player Added";
		
	}
	
	@GetMapping("/getall")
	public List<Player> getDetails(){
		return service.getAll();
		
	}

}

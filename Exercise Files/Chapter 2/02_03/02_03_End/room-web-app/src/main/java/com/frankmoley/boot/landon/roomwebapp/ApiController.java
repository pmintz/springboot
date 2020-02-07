package com.frankmoley.boot.landon.roomwebapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController
{
	
	private RoomServices roomServices;
	
	@Autowired
	ApiController(RoomServices roomServices){
		super();
		this.roomServices = roomServices;
	}
	
	@GetMapping("/rooms")
	public List<Room> getAllRooms(){
		return roomServices.getAllRooms();
	}

}

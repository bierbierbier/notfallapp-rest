package de.allianz.notfallapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.notfallapp.dao.RoomDAO;
import de.allianz.notfallapp.entity.Room;
@RestController
public class RoomController {
	@Autowired
	private RoomDAO roomDao;	
	@GetMapping("/rooms")
	public ResponseEntity<List<Room>> getAllArticles() {
		List<Room> list = (List<Room>) roomDao.findAll();
		return new ResponseEntity<List<Room>>(list, HttpStatus.OK);
	}
}

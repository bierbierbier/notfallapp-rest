package de.allianz.notfallapp.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.notfallapp.dao.WifiDAO;
import de.allianz.notfallapp.entity.Wifi;
@RestController
public class WifiController {
	@Autowired
	private WifiDAO wifiDao;	
	@GetMapping("/wifis")
	public ResponseEntity<List<Wifi>> getAllArticles() {
		List<Wifi> list = (List<Wifi>) wifiDao.findAll();
		return new ResponseEntity<List<Wifi>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/wifis") 
	public ResponseEntity<Wifi> postWifis(@RequestBody List<Wifi> input) {
		wifiDao.save(input);
		return new ResponseEntity<Wifi>(HttpStatus.CREATED);
	}
}
	
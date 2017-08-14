package de.allianz.notfallapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.notfallapp.dao.MapDAO;
import de.allianz.notfallapp.entity.Map;


@RestController
public class TestController {
	
	@Autowired
	private MapDAO mapDao;

	@RequestMapping("/greeting")
	public String hallo() {
		return "Test 123";
	}
	
	@GetMapping("/")
	public void countMaps() {
		mapDao.delete((long) 1);
	}
	
	@GetMapping("/maps")
	public ResponseEntity<List<Map>> getAllArticles() {
		List<Map> list = (List<Map>) mapDao.findAll();
		return new ResponseEntity<List<Map>>(list, HttpStatus.OK);
	}
}

package de.allianz.notfallapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.notfallapp.dao.PoiDAO;
import de.allianz.notfallapp.entity.POI;
@RestController
public class PoiController {

	@Autowired
	private PoiDAO poiDao;

	@RequestMapping("/greeting")
	public String hallo() {
		return "Test 123";
	}
	
	@GetMapping("/")
	public void countMaps() {
		poiDao.delete(1);
	}
	
	@GetMapping("/pois")
	public ResponseEntity<List<POI>> getAllArticles() {
		List<POI> list = (List<POI>) poiDao.findAll();
		return new ResponseEntity<List<POI>>(list, HttpStatus.OK);
	}
}



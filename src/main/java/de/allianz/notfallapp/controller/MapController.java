package de.allianz.notfallapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.notfallapp.dao.MapDAO;
import de.allianz.notfallapp.entity.Map;
@RestController
public class MapController {
	@Autowired
	private MapDAO mapDao;
	
//	@GetMapping("/maps")
//	public ResponseEntity<List<Map>> getMaps() {
//		List<Map> list = (List<Map>) mapDao.findAll();
//		return new ResponseEntity<List<Map>>(list, HttpStatus.OK);
//	}
	@GetMapping("/maps")
	public List<Map> getMaps() {
		List<Map> list = (List<Map>) mapDao.findAll();
		return list;
	}
	
	@PostMapping("/map")
	public ResponseEntity<?> postMap(@RequestBody Map input) {
		Map neu = new Map(input.getMap_name());
		Map ret = mapDao.save(neu);
//		try {
//		ret = mapDao.save(neu);
//		} catch (Exception e) {
//			return new ResponseEntity<Exception>(new Exception("Das hat wohl nicht geklappt"), HttpStatus.BAD_GATEWAY);
//		}
		//System.out.println("Ergebnis: " + ret.getMap_name());
		return new ResponseEntity<Map>(ret, HttpStatus.CREATED);
	}
}


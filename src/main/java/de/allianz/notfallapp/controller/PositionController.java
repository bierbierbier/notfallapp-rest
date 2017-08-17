package de.allianz.notfallapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.LinkedList;
import java.sql.Timestamp;

import de.allianz.notfallapp.dao.PositionDAO;
import de.allianz.notfallapp.dao.WifiDAO;
import de.allianz.notfallapp.entity.Position;
import de.allianz.notfallapp.entity.Wifi;
@RestController
public class PositionController {
	
	private final PositionDAO positionDao;
	private final WifiDAO wifiDao;
	
	@Autowired
	public PositionController(PositionDAO pDao, WifiDAO wDao) {
		this.positionDao=pDao;
		this.wifiDao = wDao;
	}

	
	@GetMapping("/positions")
	public ResponseEntity<List<Position>> getPositions() {
		List<Position> list = (List<Position>) positionDao.findAll();
		return new ResponseEntity<List<Position>>(list, HttpStatus.OK);
	}
	
//	@GetMapping("/positions/Timestamp")
//	public ResponseEntity<List<Position>> getPositionsWithTimestamp(@RequestBody Timestamp sqlTimestamp) {
//		Date zeitstempel = sqlTimestamp;
//		List<Position> list = (List<Position>) positionDao.findAll();
//		List<Position> ret = new LinkedList<>();
//		for(Position p : list) {
//			if(zeitstempel.before(p.getZeitstempel()))
//			ret.add(p);
//		}
//		return new ResponseEntity<List<Position>>(ret, HttpStatus.OK);
//	}
	@PostMapping("/positions")
	public ResponseEntity<Position> postPositionen(@RequestBody List<Position> input) {
		positionDao.save(input);
//		for(Position p: input) {
//			List<Wifi> wifiData = p.getWifis();
//			wifiDao.save(wifiData);
//		}
		return new ResponseEntity<Position>(HttpStatus.CREATED);
	}
}



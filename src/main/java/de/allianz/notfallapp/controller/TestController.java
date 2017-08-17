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
	
	@RequestMapping("/test")
	public String hallo() {
		return "Ich bin da";
	}
}
	
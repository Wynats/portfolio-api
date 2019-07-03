package com.wynats.portfolio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestRestController {
@GetMapping(path="/test")
    public ResponseEntity<String> getComponentConfiguration() {
		log.info("llega al /test");
		return new ResponseEntity<>("test correcto",HttpStatus.OK);
    }
	
	 
}

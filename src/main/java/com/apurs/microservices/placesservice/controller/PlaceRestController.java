package com.apurs.microservices.placesservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apurs.microservices.placesservice.dto.PlaceCreateDTO;
import com.apurs.microservices.placesservice.dto.PlaceDTO;
import com.apurs.microservices.placesservice.dto.PlaceUpdateDTO;
import com.apurs.microservices.placesservice.service.PlaceServiceImpl;

@RestController
@RequestMapping("/places")
public class PlaceRestController {

	@Autowired
	private PlaceServiceImpl placeService;
	
	@GetMapping("")
	public List<PlaceDTO> getPlaces(){
		return placeService.findAll();
	}

	@GetMapping("/{id}")
	public PlaceDTO getPlace(@PathVariable ("id") Integer id ){
		return placeService.findOne(id);
	}
	
	
	@PostMapping("")
	public ResponseEntity<PlaceDTO> insertPlace(@RequestBody PlaceCreateDTO place) {
		if (placeService.insert(place) != null)
			return new ResponseEntity<>(HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
	
	@PutMapping("")
	public ResponseEntity<PlaceDTO> updatePlace(@RequestBody PlaceUpdateDTO place) {
		if (placeService.update(place) != null)
			return new ResponseEntity<>(HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<PlaceDTO> deletePlace(@PathVariable("id") Integer id) {
		if (placeService.delete(id))
			return new ResponseEntity<>(HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

package com.apurs.microservices.placesservice.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.apurs.microservices.placesservice.dto.PlaceCreateDTO;
import com.apurs.microservices.placesservice.dto.PlaceDTO;
import com.apurs.microservices.placesservice.dto.PlaceUpdateDTO;
import com.apurs.microservices.placesservice.model.Place;
import com.apurs.microservices.placesservice.repository.PlaceRepository;

@Service
public class PlaceServiceImpl implements PlaceService {

	private PlaceRepository placeRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public PlaceServiceImpl(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	@Override
	public List<PlaceDTO> findAll() {
		List<Place> places = placeRepository.findAll();
		List<PlaceDTO> dtos = new ArrayList<PlaceDTO>();
		
		for (Place place : places)
			dtos.add(modelMapper.map(place, PlaceDTO.class));
		
		return dtos;
	}

	@Override
	public PlaceDTO findOne(Integer id) {
		Place place = placeRepository.getById(id);
		return modelMapper.map(place, PlaceDTO.class);
	}

	@Override
	public PlaceDTO insert(PlaceCreateDTO place) {
		Place createPlace = modelMapper.map(place, Place.class);
		createPlace = placeRepository.save(createPlace);
		return modelMapper.map(createPlace, PlaceDTO.class);
	}

	@Override
	public PlaceDTO update(PlaceUpdateDTO place) {
		if(!placeRepository.existsById(place.getId()))
			return null;
		
		Place tempPlace = placeRepository.getById(place.getId());
		Place updatedPlace = modelMapper.map(place, Place.class);
		updatedPlace.setCreatedAt(tempPlace.getCreatedAt());
		updatedPlace = placeRepository.save(updatedPlace);
		
		return modelMapper.map(updatedPlace, PlaceDTO.class);
	}

	@Override
	public boolean delete(Integer id) {
		if(!placeRepository.existsById(id))
			return false;
		
		placeRepository.deleteById(id);
		return true;
	}
	
}

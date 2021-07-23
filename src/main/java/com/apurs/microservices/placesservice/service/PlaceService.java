package com.apurs.microservices.placesservice.service;

import java.util.List;

import com.apurs.microservices.placesservice.dto.PlaceDTO;
import com.apurs.microservices.placesservice.dto.PlaceCreateDTO;
import com.apurs.microservices.placesservice.dto.PlaceUpdateDTO;

public interface PlaceService {
	public abstract List<PlaceDTO> findAll();
	public abstract PlaceDTO findOne(Integer id);
	public abstract PlaceDTO insert(PlaceCreateDTO place) throws Exception;
	public abstract PlaceDTO update(PlaceUpdateDTO place) throws Exception;
	public abstract boolean delete(Integer id);
}

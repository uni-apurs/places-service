package com.apurs.microservices.placesservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apurs.microservices.placesservice.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {
	List<Place> findByClassroomId(Integer id);
	List<Place> findByCourseId(Integer id);
	List<Place> findByLectureLab(Boolean lectureLab);
}

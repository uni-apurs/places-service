package com.apurs.microservices.placesservice.model;

import java.time.ZonedDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "\"place\"")
@SequenceGenerator(name = "place_id_seq", initialValue = 1, allocationSize = 1)
public class Place {
	@Id
	@Column(name = "\"id\"")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "place_id_seq")
	private int id;
	
	@Column(name = "\"classroomId\"")
	private int classroomId;

	@Column(name = "\"courseId\"")
	private int courseId;

	@Column(name = "\"lectureLab\"")
	private boolean lectureLab;

	@Column(name = "\"createdAt\"")
	private ZonedDateTime createdAt;

	@Column(name = "\"updatedAt\"")
	private ZonedDateTime updatedAt;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public boolean isLectureLab() {
		return lectureLab;
	}

	public void setLectureLab(boolean lectureLab) {
		this.lectureLab = lectureLab;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}

package com.apurs.microservices.placesservice.dto;

import java.time.ZonedDateTime;

public class PlaceUpdateDTO {
	private int id;
	private int classroomId;
	private int courseId;
	private boolean lectureLab;
	private ZonedDateTime updatedAt;
	
	public PlaceUpdateDTO(int id, int classroomId, int courseId, boolean lectureLab) {
		super();
		this.id = id;
		this.classroomId = classroomId;
		this.courseId = courseId;
		this.lectureLab = lectureLab;
		this.setUpdatedAt(ZonedDateTime.now());
	}

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

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}

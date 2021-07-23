package com.apurs.microservices.placesservice.dto;

import java.time.ZonedDateTime;

public class PlaceCreateDTO {
	private int classroomId;
	private int courseId;
	private boolean lectureLab;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;
	
	public PlaceCreateDTO(int classroomId, int courseId, boolean lectureLab) {
		super();
		this.classroomId = classroomId;
		this.courseId = courseId;
		this.lectureLab = lectureLab;
		this.setCreatedAt(ZonedDateTime.now());
		this.setUpdatedAt(ZonedDateTime.now());
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

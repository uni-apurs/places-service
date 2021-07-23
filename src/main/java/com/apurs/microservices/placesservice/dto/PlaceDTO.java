package com.apurs.microservices.placesservice.dto;

public class PlaceDTO {
	private int id;
	private int classroomId;
	private int courseId;
	private boolean lectureLab;
	
	public PlaceDTO() {
		super();
	}

	public PlaceDTO(int id, int classroomId, int courseId, boolean lectureLab) {
		super();
		this.id = id;
		this.classroomId = classroomId;
		this.courseId = courseId;
		this.lectureLab = lectureLab;
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
}

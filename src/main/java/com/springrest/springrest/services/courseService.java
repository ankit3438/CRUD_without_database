package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.enteties.course;

public interface courseService {
	public List<course> getCourses();
	public course getcourse(long courseId);
	public course addcourse(course course);
	public course updatecourse(int courseId, course course);
	public String deletecourse(int courseId);

}

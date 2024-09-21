package com.springrest.springrest.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.enteties.course;
import com.springrest.springrest.services.courseService;

@RestController                         // rest controller is combination of request mapping and responsebody
@RequestMapping("/ankit/")              //mapping this class to handle request coming from client using /ankit/ url
public class myController {
	@Autowired                          //creating object of service layer so we were creating interface object
	private courseService cs;
	
	//get the courses
	@GetMapping("/courses")
	public List<course> getcourses(){
		return this.cs.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public course getcourse(@PathVariable String courseId) {
		return this.cs.getcourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public course addcourse(@RequestBody course course) {
		return this.cs.addcourse(course);
	}
	@PutMapping("/courses/{courseId}")
	public course updatecourse(@PathVariable int courseId, @RequestBody course course) {
		return cs.updatecourse(courseId, course);
	}
	@DeleteMapping("/courses/{courseId}")
	public String deletecourse(@PathVariable int courseId) {
		return cs.deletecourse(courseId);
	}
} 

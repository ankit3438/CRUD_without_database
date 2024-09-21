package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.enteties.course;
@Service
public class courseServiceIMPL implements courseService {

	List<course> list;
	public courseServiceIMPL() {
		list = new ArrayList<>();
		list.add(new course(145,"ankit","this is course"));
		list.add(new course(146,"ankit","this is course"));
		list.add(new course(147,"ankit","this is course"));
		
		
		
		
	}
	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
		
		return list;
	}
	@Override
	public course getcourse(long courseId) {
		// TODO Auto-generated method stub
		course c = null;
		for(course t:list) {
			if(t.getId()==courseId) {
				c=t;
				break;
			}
		}
		return c;
	}
	@Override
	public course addcourse(course course) {
		list.add(course);
		return course;
	}
	@Override
	public course updatecourse(int courseId, course course) {
		// TODO Auto-generated method stub
		for(course t:list) {
			if(t.getId()==courseId) {
				t.setDescription(course.getDescription());
				t.setTitle(course.getTitle());
			}
		}
		return course;
	}
	@Override
	public String deletecourse(int courseId) {
		// TODO Auto-generated method stub
		for(course t:list) {
			if(t.getId()==courseId) {
				list.remove(t);
			}
		}
		return "yes deleted";
	}

}

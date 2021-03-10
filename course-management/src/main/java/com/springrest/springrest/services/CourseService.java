package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

//We create interface and then implementation class to bring loose coupling in the app
//To make new change, we don't need to change the controller class, just change in the implementation class is req.

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourseById(long courseId);
	
	public Course addCourseByJsonBody(Course course);
	
	public Course updateCourseById(Course course);
	
	public void deleteCourseById(long courseId);

}

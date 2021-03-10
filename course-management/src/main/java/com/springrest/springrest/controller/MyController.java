package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	//We get CourseServiceImpl object using dependency injection
	@Autowired
	private CourseService courseService;

	
	//to get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	//THe one in curly braces we can dynamically pass values from url
	//@PathVariable use krne se {} braces wla chiz uss variable m daal dega
	
	@GetMapping("/courses/{courseId}")
	public Course getCourseById(@PathVariable long courseId)
	{
		return this.courseService.getCourseById(courseId);
	}
	
	//Request body m wo hoga jo Json format m postman ke through daalenge
	@PostMapping(value="/courses", consumes="application/json")
	public Course addCourseByJsonBody(@RequestBody Course course)
	{
		return this.courseService.addCourseByJsonBody(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourseById(@RequestBody Course course)
	{
		return this.courseService.updateCourseById(course);
	}
	
	//To create a robust API, returning statuses are very important 
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourseById(@PathVariable String courseId)
	{
		try {		
	
			this.courseService.deleteCourseById(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 
	}
	

}

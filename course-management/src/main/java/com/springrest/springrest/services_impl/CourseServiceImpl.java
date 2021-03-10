package com.springrest.springrest.services_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Course(1,"Core Java Course","Core Java Concepts upto Java8"));
//		list.add(new Course(2,"Spring Rest Api COurse","Building Rest Apis using Spring Boot"));
	}

	@Override
	public List<Course> getCourses() {

//		return list;
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourseById(long courseId) {
		
//		Course c=null;
//		
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		
//		return c;
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourseByJsonBody(Course course) {
//		
//		list.add(course);
//
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourseById(Course newCourse) {
		
//		list.forEach(e->{
//			if(e.getId() == newCourse.getId())
//			{
//				e.setName(newCourse.getName());
//				e.setDescription(newCourse.getDescription());
//			}
//		});
//		
//		return newCourse;
		
		courseDao.save(newCourse); //if course exists then it updates else adds a new one
		return newCourse;
	}

	@Override
	public void deleteCourseById(long courseId) {
		
//		list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
		
		Course c=courseDao.getOne(courseId);
		courseDao.delete(c);
	}

}

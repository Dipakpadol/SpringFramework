package com.springrestapplication.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapplication.dao.CourseDao;
import com.springrestapplication.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	
//	List<Course> list;
	@Autowired
	public CourseServiceimpl(){
		
//		list=new ArrayList();
//		list.add(new Course(101,"Java Training","This Course Contain Java Development"));
//		list.add(new Course(102,"SpringBoot","Spring boot Development"));
	}
	
	@Override
	public List<Course> getCourses(){
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
	//	list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}

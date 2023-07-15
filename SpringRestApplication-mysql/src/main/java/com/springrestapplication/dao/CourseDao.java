package com.springrestapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestapplication.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}

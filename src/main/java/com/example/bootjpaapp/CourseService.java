package com.example.bootjpaapp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.*;

@Service
public class CourseService {
	
		
		@Autowired
		private CourseRepository courseRepository;
	
		public List<Course> getAllCourses(String id){
			List<Course> Courses = new ArrayList<>(); 
			courseRepository.findAll()
			.forEach(Courses::add);
			return Courses;	
		}
		
		public Optional<Course> getCourse(String id)
		
		{
			return courseRepository.findById(id);
		}

		public void addCourse(Course course) {
			
			courseRepository.save(course);
			
		}
		
		public void updateCourse(Course course) {
			courseRepository.save(course);//it can do both add and update
		}

		public void deleteCourse(String id) {
			
			courseRepository.deleteById(id);		
		
		}	
	}




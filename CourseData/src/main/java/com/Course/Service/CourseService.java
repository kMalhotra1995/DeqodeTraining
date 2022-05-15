package com.Course.Service;

import java.util.List;

import com.Course.Model.CourseData;

public interface CourseService {

	//method to create or update a Course
			public void Create(CourseData course);
			
			//method to get list of all Course
			public List<CourseData> getAllCourse();
			
			//method to find Course by ID 
			public CourseData findCourseById(Integer id);
			
			//method to delete Course by ID
			public void deleteCourse(Integer id);
			
			//method to find Course by name
			public List<CourseData> findCourseName(String name);
			
			//method to find Course by city
			public List<CourseData> findCourseByTutor(String name);
				
			//method to find Course by country
			public List<CourseData> findCourseBySubject(String name);
}

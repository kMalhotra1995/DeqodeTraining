package com.Course.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Course.DAO.CourseDAO;
import com.Course.Model.CourseData;
import com.Course.Rest.CourseRestController;

@Service
public class CourseServiceImpl implements CourseService{
	
	Logger logger = LoggerFactory.getLogger(CourseRestController.class);
	
	@Autowired
	private CourseDAO courseDAO;

	@Override
	public void Create(CourseData course) {
		try {
		courseDAO.Create(course);
		logger.info("Course Data Inserted");
		
		}
		catch (Exception e) {
			logger.info("Error while Creating Data",e.getStackTrace());
		}

	}

	@Override
	public List<CourseData> getAllCourse() {
		List<CourseData> getCourse=null;
		try {
		getCourse=courseDAO.getAllCourse();
		logger.info("All course Data");
		}
		catch (Exception e) {
			logger.info("Error while fetching Data",e.getStackTrace());
		}
		return getCourse;
	}

	@Override
	public CourseData findCourseById(Integer id) {
		CourseData theCourse=null;
		try {
		theCourse=courseDAO.findCourseById(id);
		logger.info("Course Info by Id");
		}
		catch (Exception e) {
			logger.info("Error while fetching Data",e.getStackTrace());
		}
		return theCourse;
	}

	@Override
	public void deleteCourse(Integer id) {
		try {
		courseDAO.deleteCourse(id);
		}
		catch (Exception e) {
			logger.info("Error while fetching Data",e.getStackTrace());
		}
		
	}

	@Override
	public List<CourseData> findCourseName(String Cname) {
		
		List<CourseData> theCourse=null;
		try {
		theCourse=courseDAO.findCourseName(Cname);
		}
		catch (Exception e) {
			logger.info("Error while fetching Data",e.getStackTrace());

		}
		return theCourse;
	}

	@Override
	public List<CourseData> findCourseByTutor(String Tname) {
		
		List<CourseData> theCourse=null;
		try {
		theCourse=courseDAO.findCourseName(Tname);
		}
		catch (Exception e) {
			logger.info("Error while fetching Data",e.getStackTrace());
		}
		return theCourse;
	}

	@Override
	public List<CourseData> findCourseBySubject(String Sname) {
		
		List<CourseData> theCourse=null;
		try {
		theCourse=courseDAO.findCourseName(Sname);
		}
		catch (Exception e) {
			logger.info("Error while fetching Data",e.getStackTrace());

		}
		return theCourse;
	}

	
}

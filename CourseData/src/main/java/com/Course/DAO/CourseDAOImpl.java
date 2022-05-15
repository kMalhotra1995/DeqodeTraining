package com.Course.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.Course.Model.CourseData;

@Repository
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;

	

	@Override
	public List<CourseData> getAllCourse() {
		List<CourseData> AllCourse=mongoTemplate.findAll(CourseData.class);
		return AllCourse;
	}

	@Override
	public CourseData findCourseById(Integer id) {
		CourseData course=mongoTemplate.findById(id, CourseData.class);
		return course;
	}

	@Override
	public void deleteCourse(Integer id) {
		CourseData course=mongoTemplate.findById(id, CourseData.class);
		mongoTemplate.remove(course);
	}

	@Override
	public List<CourseData> findCourseName(String Cname) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(Cname));
		List<CourseData> theCourse=mongoTemplate.find(query, CourseData.class);
		return theCourse;
	}

	@Override
	public List<CourseData> findCourseByTutor(String Tname) {
		Query query = new Query();
		query.addCriteria(Criteria.where("tutor").is(Tname));
		List<CourseData> theCourse=mongoTemplate.find(query, CourseData.class);
		return theCourse;
	}

	@Override
	public List<CourseData> findCourseBySubject(String Sname) {
		Query query = new Query();
		query.addCriteria(Criteria.where("subject").is(Sname));
		List<CourseData> theCourse=mongoTemplate.find(query, CourseData.class);
		return theCourse;
	}

	@Override
	public void Create(CourseData course) {
		mongoTemplate.save(course);
		
	}

	
}

package com.Course.Rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Course.Model.CourseData;
import com.Course.Service.CourseServiceImpl;

@RestController
@RequestMapping("/Courses")
public class CourseRestController {
	
	
	
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/getall")
	public List<CourseData> showAllCourses(){
		return courseServiceImpl.getAllCourse();
	}
	
	
	
	@GetMapping("/findById/{id}")
	public CourseData getCourseById(@PathVariable Integer id) {
		return courseServiceImpl.findCourseById(id);
	}
	
	
	@PostMapping("/create")
	public void CreateCourse(@RequestBody CourseData theCourse){
		courseServiceImpl.Create(theCourse);
	}
	
	
	@PutMapping("/update")
	public void updateCourse(@RequestBody CourseData theCourse){
		courseServiceImpl.Create(theCourse);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable Integer id) {
		courseServiceImpl.deleteCourse(id);
		
		return "Deleted";
		
	}
	
	
	@GetMapping("/findByName/{Cname}")
	public List<CourseData> getCourseByName(@PathVariable String Cname) {
		return courseServiceImpl.findCourseBySubject(Cname);
	}
		
	
	@GetMapping("/findByTutor/{Tname}")
	public List<CourseData> getCourseByTutor(@PathVariable String Tname) {
		return courseServiceImpl.findCourseByTutor(Tname);
	}
		
	
	@GetMapping("/findBySubject/{Sname}")
	public List<CourseData> getCourseBySubject(@PathVariable String Sname) {
		return courseServiceImpl.findCourseBySubject(Sname);
	}

}

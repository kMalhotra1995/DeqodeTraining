package com.Course.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "CourseData")
public class CourseData {

	@Id
	private Integer id;
	private String name;
	private String subject;
	private String tutor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		return "CourseData [id=" + id + ", name=" + name + ", subject=" + subject + ", tutor=" + tutor + "]";
	}
	
	
	
}

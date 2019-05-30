package com.cdac.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gaurya")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_Id")
	private Integer studentId;
	
	private String name;
	private String country;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", country=" + country + "]";
	}
	
	

}

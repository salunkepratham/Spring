package com.cdac.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdac.mvc.model.Student;
public interface IStudentService {
	public Student addStudent(Student student);
	public List<Student>getStudentList();
	public Student updateStudent(Student student);
	public Student removeStudent(int studentId);
	public Student getStudentById(int studentId);
}
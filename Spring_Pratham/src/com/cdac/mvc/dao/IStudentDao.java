package com.cdac.mvc.dao;

import java.util.List;

import com.cdac.mvc.model.Student;

public interface IStudentDao {
	public Student addStudent(Student student);
	public List<Student>getStudentList();
	public Student updateStudent(Student student);
	public Student removeStudent(int studentId);
	public Student getStudentById(int studentId);
}

package com.cdac.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.mvc.dao.IStudentDao;
import com.cdac.mvc.dao.StudentDaoImpl;
import com.cdac.mvc.model.Student;
@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private IStudentDao studentDao;

	@Transactional
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.addStudent(student);
	}
	@Transactional
	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return this.studentDao.getStudentList();
	}
	@Transactional
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.updateStudent(student);
	}
	@Transactional
	@Override
	public Student removeStudent(int studentId) {
		// TODO Auto-generated method stub
		return this.studentDao.removeStudent(studentId);
	}
	@Transactional
	@Override
	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return this.studentDao.getStudentById(studentId);
	}

}

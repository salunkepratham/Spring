package com.cdac.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.mvc.model.Student;
@Repository
public class StudentDaoImpl implements IStudentDao{
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Student addStudent(Student student) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(student);
		
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public List<Student> getStudentList() {
		Session session=this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Student> list=session.createQuery("from Student").list();
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Student updateStudent(Student student) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(student);
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public Student removeStudent(int studentId) {
		Session session=this.sessionFactory.getCurrentSession();
		Student student=(Student) session.load(Student.class,new Integer(studentId));
		// TODO Auto-generated method stub
		if(student!=null) {
			session.delete(student);
		}
		return student;
	}

	@Override
	public Student getStudentById(int studentId) {
		Session session=this.sessionFactory.getCurrentSession();
		Student p=(Student) session.load(Student.class, new Integer(studentId));
		// TODO Auto-generated method stub
		return p;
	}

}

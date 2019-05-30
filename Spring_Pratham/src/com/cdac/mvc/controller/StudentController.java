package com.cdac.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.mvc.model.Student;
import com.cdac.mvc.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService studentService;
	@RequestMapping("/")
	public String showIndexPage(Model model) {
		model.addAttribute("title", 
				"Welcome to My Spring Hibernate MVC Application");
		return new String("index");//viewName
	}
	@RequestMapping("/students")
	public String showStudentList(Model model) {
		Student student=new Student();
		List<Student> studentList=studentService.getStudentList();
		model.addAttribute("student",student);
		model.addAttribute("studentList",studentList);
		return new String("studentPage");
	}

}

package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/test")
public class DemoRestController {

	// add code for the "/hello" endpoint
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/students")
	public List<Student> addStudent()
	{
		List<Student> theStudentList = new ArrayList<Student>();
		
		theStudentList.add(new Student ("Mario","Patel"));
		theStudentList.add(new Student ("Mario","Bros"));
		theStudentList.add(new Student ("Mary","Smith"));
		
		return theStudentList;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentId(@PathVariable int studentId)
	{
		List<Student> theStudentList = new ArrayList<Student>();
		
		theStudentList.add(new Student ("Mario","Patel"));
		theStudentList.add(new Student ("Mario","Bros"));
		theStudentList.add(new Student ("Mary","Smith"));
		
		return theStudentList.get(studentId);
	}
}

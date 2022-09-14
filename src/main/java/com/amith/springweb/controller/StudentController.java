package com.amith.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amith.springweb.model.Student;
import com.amith.springweb.repos.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value="/students",method= RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int id) {
		return studentRepository.findById(id).get();
		
	}
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		studentRepository.deleteById(id);
	}
	
	@RequestMapping(value="/students",method=RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	

}

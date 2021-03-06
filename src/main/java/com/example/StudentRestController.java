package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	@Autowired
	StudentService theStudentService;
	
	@RequestMapping(value = "/getAllstudent", method = RequestMethod.GET)
	public List<Student> getstudent() {
		return (List<Student>) theStudentService.getStudents();
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Student> getAll() {
		return (List<Student>) theStudentService.getStudents();
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Student get(@PathVariable("id") Long id) {
		return theStudentService.getStudent(id);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@RequestBody Student student) {
		theStudentService.saveStudent(student);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Student student) {
		theStudentService.updateStudent(student);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		theStudentService.deleteStudent(id);
	}
}

package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepository theStudentRepository;

	public List<Student> getStudents() {
		return (List<Student>) theStudentRepository.findAll();
	}

	public Student getStudent(Long id) {
		return theStudentRepository.findOne(id);
	}

	public void saveStudent(Student student) {
		theStudentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		theStudentRepository.delete(id);
	}

	public void updateStudent(Student student) {
		theStudentRepository.save(student);
	}

}

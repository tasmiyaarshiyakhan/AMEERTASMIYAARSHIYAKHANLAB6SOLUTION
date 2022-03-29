package com.greatLearning.StudentsManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.StudentsManagementSystem.Repository.StudentRepository;
import com.greatLearning.StudentsManagementSystem.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Student student =new Student();
		student= studentRepository.findById(id).get();
		return student;
	}

}

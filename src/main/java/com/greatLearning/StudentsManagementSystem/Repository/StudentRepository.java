package com.greatLearning.StudentsManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatLearning.StudentsManagementSystem.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

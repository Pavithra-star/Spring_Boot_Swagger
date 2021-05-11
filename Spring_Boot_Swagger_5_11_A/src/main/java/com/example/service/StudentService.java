package com.example.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.module.Student;

@Service
public class StudentService {
 @Autowired
 private StudentDao studentdao;
 
 public Student createStudent(Student stud) {
	 return studentdao.save(stud);
 }
 
 public Optional<Student> getStudentById(int id){
	 return studentdao.findById(id);
	 
 }
 public List<Student> getAllStudents(){
	 return studentdao.findAll();
 }
 public String deleteStudentById(int id) {
	 studentdao.deleteById(id);
	 return "Deletes" +id;
 }
}

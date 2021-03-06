package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.module.Student;
import com.example.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger_Student_Controller")
@RestController
@RequestMapping("/api")
public class StudentController {
 @Autowired
 private StudentService studentservice;
 
 @ApiOperation(value ="Create Student Information")
 @PostMapping("/create")
 public Student createStudent(@RequestBody Student stud) {
	 return studentservice.createStudent(stud);
 }
 @GetMapping("/findStudent/{id}")
 @ApiOperation(value ="Get student details based on id")
 public Optional<Student> getStudentById(@PathVariable int id){
	
	 return studentservice.getStudentById(id);
	 
 }
 @GetMapping("getAllStudents")
 public List<Student> getAllStudents(){
	 return studentservice.getAllStudents();
 }
 @ApiOperation("delete student based on id")
 @DeleteMapping("/deleteStudent/{id}")
 public String deleteStudentById(@PathVariable int id) {
	 return studentservice.deleteStudentById(id);
 }
 
}

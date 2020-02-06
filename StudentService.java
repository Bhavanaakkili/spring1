package com.bhavana.jdbctemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavana.jdbctemplate.dao.StudentDao;
import com.bhavana.jdbctemplate.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
    public List<Student> getAllStudents(){
    	return studentDao.getAllStudents();
    }
}
package com.bhavana.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhavana.jdbctemplate.model.Student;
import com.bhavana.jdbctemplate.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	StudentService studentService;
	
   @RequestMapping("/home")
   String home() {
	   return "home";
   }
   
   @RequestMapping("/listStudents")
   String getStudents(Model model) {
	   List<Student> list = studentService.getAllStudents();
	   System.out.println(list);
	   model.addAttribute("liststud", list);
	   return "liststudents";
   }
   
}
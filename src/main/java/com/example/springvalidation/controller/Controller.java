package com.example.springvalidation.controller;

import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springvalidation.entity.Student;

import jakarta.validation.Valid;

@RestController
	@RequestMapping("/students")
	public class Controller {

	    @PostMapping
	    public String addStudent(@Valid @RequestBody Student student) {
	        return "Student Added";
	    }
	}


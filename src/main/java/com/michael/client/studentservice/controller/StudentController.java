/**
 * 
 */
package com.michael.client.studentservice.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.client.studentservice.model.Student;

/**
 * @author 109726
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private Environment environment;
    
	@GetMapping(value = "/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name)
	{
        int servingPort = Integer.parseInt(environment.getProperty("local.server.port"));        
		return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " 
		+ new Date() + "at port - " + servingPort;
	}

	@GetMapping(value = "/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable(name = "name") String name)
	{
        int servingPort = Integer.parseInt(environment.getProperty("local.server.port"));
		return new Student(name, "Pune", "MCA",servingPort);
	}

}

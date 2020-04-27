package com.Watheq.Watheq.controller;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.dto.CourseDTO;
import com.Watheq.Watheq.model.Course;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.model.Individual;
import com.Watheq.Watheq.repository.CourseRepository;
import com.Watheq.Watheq.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseRepository course;
	@Autowired
	CourseService courseService;
	Individual nationalId=new Individual("1234567890");
	EducationInstitution educationInstitution=new EducationInstitution("121");
	
	CourseDTO courseDTO=new CourseDTO("1",nationalId, null,educationInstitution,
			"aa","aa",null,null,
			"aa","aa");
//Date.valueOf("2018-11-12 01:02:03.123456789")
	//todo how add arguments 
	//CourseDTO courseDTO= new CourseDTO("12","2","12","121","q","q",null, null,"q","q");

	@RequestMapping("/saveCourse")
	public String process(){
		courseService.createCourseDTO(courseDTO);
		//course.save(new Course("nn@","05566","as","123","12", "q", "Female",null, null));
		return "Done";
	}//end process()

	@RequestMapping("/findAllCourse")
	public String findAll(){
		String result = "<html>";

		for(Course cust : course.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}//end for 

		return result + "</html>";
	}//end findall

}//end class

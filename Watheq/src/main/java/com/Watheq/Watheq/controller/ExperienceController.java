package com.Watheq.Watheq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.model.Experience;
import com.Watheq.Watheq.repository.ExperienceRepository;
import com.Watheq.Watheq.service.ExperienceService;


@RestController

public class ExperienceController {

	@Autowired
	ExperienceRepository experience;
	
	@Autowired
	ExperienceService experienceService;

	@RequestMapping("/saveExperience")
	public String process(){

		//experience.save(new Experience("nn@","05566","as","123","12", "q", "Female"));
		return "Done";
	}//end process()

	@RequestMapping("/findAllExperience")
	public String findAll(){
		String result = "<html>";

		for(Experience cust : experience.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}//end for 

		return result + "</html>";
	}//end findall
	
	@RequestMapping("/FindExperienceId")
	public String FindbyID() throws Exception{

		experienceService. getById(121L);

		return "find Experience ";
	}//end FindbyID()
}//end class

package com.Watheq.Watheq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.model.Recommendation;
import com.Watheq.Watheq.repository.RecommendationRepository;


@RestController

public class RecommendationController {

	@Autowired
	RecommendationRepository recom;

	@RequestMapping("/saveRecommendation")
	public String process(){

		//recom.save(new Recommendation("nn@","05566","as","123","12", "q", "Female"));
		return "Done";
	}//end process()

	@RequestMapping("/findAllRecommendation")
	public String findAll(){
		String result = "<html>";

		for(Recommendation cust : recom.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}//end for 

		return result + "</html>";
	}//end findall
}//end class

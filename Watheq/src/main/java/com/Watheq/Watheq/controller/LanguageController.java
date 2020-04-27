package com.Watheq.Watheq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.model.Language;
import com.Watheq.Watheq.repository.LanguageRepository;
import com.Watheq.Watheq.service.LanguageService;


@RestController
public class LanguageController {

	@Autowired
	LanguageRepository lang;
	
	@Autowired
	LanguageService languageService;

	@RequestMapping("/saveLang")
	public String process(){

		//lang.save(new Language("nn@","05566","as","123","12", "q", "Female"));
		return "Done";
	}//end process()

	@RequestMapping("/findAllLang")
	public String findAll(){
		String result = "<html>";

		for(Language cust : lang.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}//end for 

		return result + "</html>";
	}//end findall
	
	@RequestMapping("/FindLangId")
	public String FindbyID() throws Exception{

		languageService. getById(121L);

		return "find Experience ";
	}//end FindbyID()
}//end class

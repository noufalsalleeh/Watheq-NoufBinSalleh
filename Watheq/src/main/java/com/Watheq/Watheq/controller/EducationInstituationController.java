package com.Watheq.Watheq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.dto.CompanyDTO;
import com.Watheq.Watheq.dto.EducationInstitutionDTO;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.repository.EducationInstitutionRepository;
import com.Watheq.Watheq.service.EducationInstituationService;

@RestController
public class EducationInstituationController {
	@Autowired 
	EducationInstitutionRepository eduInst;

	@Autowired
	EducationInstituationService educationInstituationService;

	EducationInstitutionDTO educationInstitutionDTO= new EducationInstitutionDTO("d@gmail.com","05566","as","123","121","q","wq");

	@RequestMapping("/saveEduInst") 
	public String process(){
		educationInstituationService.createEducationInstituationDTO(educationInstitutionDTO);
		//eduInst.save(new EducationInstitution("nn@","05566","as","123","12", "q","Female"));
		return "Done"; 
	}//end process()

	@RequestMapping("/findAllEduInst") public String findAll(){ String result =
			"<html>";
	for(EducationInstitution cust : eduInst.findAll())
	{
		result += "<div>" + cust.toString() + "</div>";
	}//end for

	return result + "</html>"; 
	}//end findall
	
	@RequestMapping("/FindEduInstId")
	public String FindbyID() throws Exception{

		educationInstituationService.getById("121");

		return "find education Instituation";
	}//end FindbyID()
	
	@RequestMapping("/updateUniversityName")
	public EducationInstitutionDTO updateUniversityName() throws Exception{

		return educationInstituationService.updateUniversityNameDTO("1234567890","c");
	}//end updateUniversityName()
	
	@RequestMapping("/updateUniversityType")
	public EducationInstitutionDTO updateUniversityType() throws Exception{

		return educationInstituationService.updateUniversityTypeDTO("1234567890","c");
	}//end updateUniversityType()
	
	@RequestMapping("/updateEmailEduInst")
	public EducationInstitutionDTO updateEmailEduInst() throws Exception{

		return educationInstituationService.updateEmailEduInstDTO("1234567890","r");
	}//end updateEmailEduInst()
	
	@RequestMapping("/updatePhoneNumberEduInst")
	public EducationInstitutionDTO updatePhoneNumberEduInst() throws Exception{

		return educationInstituationService.updatePhoneNumberEduInstDTO("1234567890","r");
	}//end updatePhoneNumberEduInst()
	
	
	@RequestMapping("/updateAddressEduInst")
	public EducationInstitutionDTO updateAddressEduInst() throws Exception{

		return educationInstituationService.updateAddressEduInstDTO("1234567890","r");
	}//end updateAddressEduInst()
	
	@RequestMapping("/updatePasswordEduInst")
	public EducationInstitutionDTO updatePasswordCEduInst() throws Exception{

		return educationInstituationService.updatePasswordEduInstDTO("1234567890","r");
	}//end updatePasswordCEduInst()
}// end class

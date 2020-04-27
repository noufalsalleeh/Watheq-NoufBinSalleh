package com.Watheq.Watheq.controller;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.dto.IndividualDTO;

import com.Watheq.Watheq.repository.IndividualRepository;
import com.Watheq.Watheq.service.IndividualService;

@RestController
public class IndividualController {

	@Autowired
	IndividualRepository repository;

	@Autowired
	IndividualService individualService;


	IndividualDTO individualDTO =new
			IndividualDTO("d@gmail.com","0534526","riyadh","12ccass3","1234567890", "d",
					"d", "d","Female", "Single", "s",
					Date.valueOf("2018-11-12 01:02:03.123456789"), "f");

	// Date.valueOf("2018-11-12 01:02:03.123456789")

	@RequestMapping("/saveIndividual") public String process(){
		//repository.deleteAll();
		individualService.createIndividualDTO(individualDTO);

		return "New individual added successfully"; }//end process()
	/*
	 * @RequestMapping("/updateStatusIndividual") public IndividualDTO
	 * updateStatusIndividual() throws Exception{
	 * 
	 * return individualService.updateStatusIndividualDTO("1234567890","r"); }//end
	 * updateStatusIndividual()
	 * 
	 * @RequestMapping("/updateSkillIndividual") public IndividualDTO
	 * updateSkillIndividual() throws Exception{
	 * 
	 * return individualService.updateSkillIndividualDTO("1234567890","r"); }//end
	 * updateSkillIndividual()
	 * 
	 * 
	 * @RequestMapping("/updateAttachIndividual") public IndividualDTO
	 * updateAttachmentIndividual() throws Exception{
	 * 
	 * return individualService.updateAttachmentIndividualDTO("1234567890","r");
	 * }//end updateAttachmentIndividual()
	 * 
	 * @RequestMapping("/updateEmailIndividual") public IndividualDTO
	 * updateEmailIndividual() throws Exception{
	 * 
	 * return individualService.updateEmailIndividualDTO("1234567890","r"); }//end
	 * updateEmailIndividual()
	 * 
	 * 
	 * @RequestMapping("/updatePhoneNumberIndividual") public IndividualDTO
	 * updatePhoneNumberIndividual() throws Exception{
	 * 
	 * return individualService.updatePhoneNumberIndividualDTO("1234567890","r");
	 * }//end updatePhoneNumberIndividual()
	 */
	@RequestMapping("/updateAddressIndividual") public IndividualDTO
	updateAddressIndividual() throws Exception{

		return individualService.updateAddressIndividualDTO("1234567890","tt");
	}//end updateAddressIndividual()

	@RequestMapping("/updatePasswordIndividual") public IndividualDTO
	updatePasswordIndividual() throws Exception{

		return individualService.updatePasswordIndividualDTO("1234567890","r");
	}//end updatePhoneNumberIndividual()


	@RequestMapping("/findIndId") public String findById(@RequestParam("id")
	String id){ String result = ""; result =
	individualService.getById(id).toString(); return result; }//end findById()


}// end class

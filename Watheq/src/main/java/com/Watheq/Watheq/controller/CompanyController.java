package com.Watheq.Watheq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.dto.CompanyDTO;
import com.Watheq.Watheq.model.Company;
import com.Watheq.Watheq.repository.CompanyRepository;
import com.Watheq.Watheq.service.CompanyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CompanyController {


	@Autowired
	CompanyRepository comp;

	@Autowired
	CompanyService companyService;

	//CompanyDTO companyDTO= new CompanyDTO("daas@gmail.com","05566","as","123","121","q",null, null);

	@GetMapping("/companys")
	public List<Company> getAllCompanys() {
		System.out.println("Get all Companys...");

		List<Company> companys = new ArrayList<>();
		comp.findAll().forEach(companys::add);

		return companys;
	}//end getAllCompanys
	
	@PostMapping(value = "/createCompany")
	public String createCompany(@RequestBody CompanyDTO companyDTO) {
		  System.out.println("company save call");
		   companyService.createCompanyDTO(companyDTO); 
	
		return "Done";
	}//end postCompany()
	
	
	/*
	 * @RequestMapping("/saveCompany") public String process(){
	 * companyService.createCompanyDTO(companyDTO);
	 * 
	 * return "Done"; }//end process()
	 */

	@RequestMapping("/updateStartDateCompany")
	public CompanyDTO updateStartDate() throws Exception{

		return companyService.updateStartDateCompanyDTO("1234567890",null);
	}//end updateStartDate()

	@RequestMapping("/updateEndDateCompany")
	public CompanyDTO updateEndDate() throws Exception{

		return companyService.updateEndDateCompanyDTO("1234567890",null);
	}//end updateEndDate()

	@RequestMapping("/updateEmailCompany")
	public CompanyDTO updateEmailCompany() throws Exception{

		return companyService.updateEmailCompanyDTO("1234567890","r");
	}//end updateEmailCompany()

	@RequestMapping("/updatePhoneNumberCompany")
	public CompanyDTO updatePhoneNumberCompany() throws Exception{

		return companyService.updatePhoneNumberCompanyDTO("1234567890","r");
	}//end updatePhoneNumberCompany()


	@RequestMapping("/updateAddressCompany")
	public CompanyDTO updateAddressCompany() throws Exception{

		return companyService.updateAddressCompanyDTO("1234567890","r");
	}//end updateAddressCompany()

	@RequestMapping("/updatePasswordCompany")
	public CompanyDTO updatePasswordCompany() throws Exception{

		return companyService.updatePasswordCompanyDTO("1234567890","r");
	}//end updatePasswordCompany()


	@RequestMapping("/FindCompanyCR")
	public String FindbyID() throws Exception{

		companyService. getById("121");

		return "findCompanyy";
	}//end FindbyID()
}//end class 



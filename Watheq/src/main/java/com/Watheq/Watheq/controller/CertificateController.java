package com.Watheq.Watheq.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Watheq.Watheq.dto.CertificateDTO;
import com.Watheq.Watheq.model.Certificate;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.model.Individual;
import com.Watheq.Watheq.repository.CertificateRepository;
import com.Watheq.Watheq.service.CertificateService;


@RestController
public class CertificateController {

	@Autowired
	CertificateRepository cert;

	@Autowired
	CertificateService certService;
	
	Individual nationalId=new Individual("0123456789");
	EducationInstitution educationInstitution=new EducationInstitution("q","121","qw");


	//CertificateDTO  certificateDTO=new CertificateDTO("a1",null,educationInstitution,null,null,"a",  Timestamp.valueOf("1983-07-12 21:30:55.888"),4.5,"a","a");

	@RequestMapping("/saveCertificate")
	public String process(){
		//certService.createCertificationDTO(certificateDTO);
		
		return "Done";
	}//end process()

	@RequestMapping("/findAllCertificate")
	public String findAll(){
		String result = "<html>";

		for(Certificate cust : cert.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}//end for
		return result + "</html>";
	}//end findall
	
}//end class

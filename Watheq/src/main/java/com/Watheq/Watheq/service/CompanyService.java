package com.Watheq.Watheq.service;

import java.sql.Timestamp;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.CompanyDTO;
import com.Watheq.Watheq.exception.NotFoundException;
import com.Watheq.Watheq.mapperImp.CompanyMapperImp;
import com.Watheq.Watheq.model.Company;
import com.Watheq.Watheq.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	CompanyRepository companyRepository;

	private static final CompanyMapperImp companyMapper = new CompanyMapperImp();

	public CompanyDTO createCompanyDTO(CompanyDTO companyDTO) {

		Company company = Company.builder()
				.email(companyDTO.getEmail())
				.phoneNumber(companyDTO.getPhoneNumber())
				.address(companyDTO.getAddress())
				.companyRefrence(companyDTO.getCompanyRefrence())
				.companyname(companyDTO.getCompanyName())
				.startDate(companyDTO.getStartDate())
				.endDate(companyDTO.getEndDate())
				.password(companyDTO.getPassword())
				.build();

		Company saveCompany = companyRepository.save(company);
		return companyMapper.domainToDto(saveCompany);


	}//end createCompanyDTO()

	//update indi email
	public  CompanyDTO updateStartDateCompanyDTO (String cr, Timestamp startDate) throws Exception{
		try{
			companyRepository.updateStartDate(cr, startDate);
			return companyRepository.findById(cr).map(companyMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", cr));
			
		}
	}//end updateStartDateCompanyDTO()


	//update indi email
	public  CompanyDTO updateEndDateCompanyDTO (String cr, Timestamp endDate) throws Exception{
		try{
			companyRepository.updateEndDate(cr, endDate);
			return companyRepository.findById(cr).map(companyMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", cr));
			
		}
	}//end updateEndDateCompanyDTO()


	//update comp email
	public  CompanyDTO updateEmailCompanyDTO (String cr, String email) throws Exception{
		try{
			companyRepository.updateEmail(cr, email);
			return companyRepository.findById(cr).map(companyMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", cr));
			
		}
	}//end updateEmailCompanyDTO()

	//update comp phone Number
	public  CompanyDTO updatePhoneNumberCompanyDTO (String cr, String phoneNumber) throws Exception{
		try{
			companyRepository.updatePhoneNumber(cr, phoneNumber);
			return companyRepository.findById(cr).map(companyMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", cr));
			
		}
	}//end updatePhoneNumberCompanyDTO()


	//update comp address
	public  CompanyDTO updateAddressCompanyDTO (String cr, String address) throws Exception{
		try{
			companyRepository.updateAddress(cr, address);
			return companyRepository.findById(cr).map(companyMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", cr));
			
		}
	}//end updateAddressCompanyDTO()


	//update comp pass 
	public  CompanyDTO updatePasswordCompanyDTO (String cr, String password) throws Exception{
		try{
			companyRepository.updatePassword(cr, password);
			return companyRepository.findById(cr).map(companyMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", cr));
			
		}
	}//end updatePasswordCompanyDTO()


	public CompanyDTO getById(String id) {
		try {
			return companyRepository.findById(id).map(companyMapper::domainToDto).get();
		}catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
		}//end  catch
	}//end getById()
}//end class 

package com.Watheq.Watheq.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.EducationInstitutionDTO;
import com.Watheq.Watheq.exception.NotFoundException;
import com.Watheq.Watheq.mapperImp.EducationInstitutionMapperImp;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.repository.EducationInstitutionRepository;

@Service
public class EducationInstituationService {

	@Autowired
	EducationInstitutionRepository educationInstituationRepository;
	private static final EducationInstitutionMapperImp EducationInstituationMapper = new EducationInstitutionMapperImp();

	public EducationInstitutionDTO createEducationInstituationDTO(EducationInstitutionDTO educationInstituationDTO) {


		EducationInstitution education = EducationInstitution.builder()
				.email(educationInstituationDTO.getEmail())
				.phone_number(educationInstituationDTO.getPhoneNumber())
				.address(educationInstituationDTO.getAddress())
				.password(educationInstituationDTO.getPassword())
				.eduInstitutionId(educationInstituationDTO.getEducationInstitutionId())
				.universityName(educationInstituationDTO.getUniversityName())
				.universityType(educationInstituationDTO.getUniversityType())
				.build();

		EducationInstitution saveEducation = educationInstituationRepository.save(education);
		return EducationInstituationMapper.domainToDto(saveEducation);




	}//end createEducationInstituationDTO()


	//update UniversityName
	public  EducationInstitutionDTO updateUniversityNameDTO (String eduInstitutionId, String universityName) throws Exception{
		try{
			educationInstituationRepository.updateUniversityName(eduInstitutionId, universityName);
			return educationInstituationRepository.findById(eduInstitutionId).map(EducationInstituationMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", eduInstitutionId));

		}
	}//end updateUniversityNameDTO()


	//update UniversityType
	public  EducationInstitutionDTO updateUniversityTypeDTO (String eduInstitutionId, String universityType) throws Exception{
		try{
			educationInstituationRepository.updateUniversityType(eduInstitutionId, universityType);
			return educationInstituationRepository.findById(eduInstitutionId).map(EducationInstituationMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", eduInstitutionId));

		}
	}//end updateUniversityTypeDTO()


	//update EducationInstitution email
	public  EducationInstitutionDTO updateEmailEduInstDTO (String eduInstitutionId, String email) throws Exception{
		try{
			educationInstituationRepository.updateEmail(eduInstitutionId, email);
			return educationInstituationRepository.findById(eduInstitutionId).map(EducationInstituationMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", eduInstitutionId));

		}
	}//end updateEmailEduInstDTO()

	//update EducationInstitution phone Number
	public  EducationInstitutionDTO updatePhoneNumberEduInstDTO (String eduInstitutionId, String phoneNumber) throws Exception{
		try{
			educationInstituationRepository.updatePhoneNumber(eduInstitutionId, phoneNumber);
			return educationInstituationRepository.findById(eduInstitutionId).map(EducationInstituationMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", eduInstitutionId));

		}
	}//end updatePhoneNumberEduInstDTO()

	//update EducationInstitution address
	public  EducationInstitutionDTO updateAddressEduInstDTO (String eduInstitutionId, String address) throws Exception{
		try{
			educationInstituationRepository.updateAddress(eduInstitutionId, address);
			return educationInstituationRepository.findById(eduInstitutionId).map(EducationInstituationMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", eduInstitutionId));

		}
	}//end updateAddressEduInstDTO()


	//update EducationInstitution pass 
	public  EducationInstitutionDTO updatePasswordEduInstDTO (String eduInstitutionId, String password) throws Exception{
		try{
			educationInstituationRepository.updatePassword(eduInstitutionId, password);
			return educationInstituationRepository.findById(eduInstitutionId).map(EducationInstituationMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", eduInstitutionId));

		}
	}//end updatePasswordEduInstDTO()


	public EducationInstitutionDTO getById(String id) {
		try {
			return educationInstituationRepository.findById(id).map(EducationInstituationMapper::domainToDto).get();
		}catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
		}//end  catch
	}//end getById()
	
}//end class 

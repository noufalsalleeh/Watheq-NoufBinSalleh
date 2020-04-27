package com.Watheq.Watheq.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.IndividualDTO;
import com.Watheq.Watheq.exception.NotFoundException;
import com.Watheq.Watheq.mapperImp.IndividualMapperImp;
import com.Watheq.Watheq.model.Individual;
import com.Watheq.Watheq.repository.IndividualRepository;
@Service
public class IndividualService {
	@Autowired
	IndividualRepository individualRepository;
	private static final IndividualMapperImp individualMapper = new IndividualMapperImp();
	
	
	
	public IndividualDTO createIndividualDTO(IndividualDTO individualDTO) {
		
		Individual individual = Individual.builder()
				.nationalId(individualDTO.getNationalId())
				.email(individualDTO.getEmail())
				.phoneNumber(individualDTO.getPhoneNumber())
				.address(individualDTO.getAddress())
				.firstName(individualDTO.getFirstName())
                .middleName(individualDTO.getMiddleName())
                .lastName(individualDTO.getLastName())
                .gender(individualDTO.getGender())
                .status(individualDTO.getStatus())
                .skill(individualDTO.getSkill())
                .dateOfBirth(individualDTO.getDateOfBirth())
                .attachment(individualDTO.getAttachment())
                .build();
		
		Individual saveIndividual = individualRepository.save(individual);
        return individualMapper.domainToDto(saveIndividual);
        
    }//end createIndividualDTO()

	
	
	
	//update indi status
	public  IndividualDTO updateStatusIndividualDTO (String natioalId, String status) throws Exception{
		try{
			individualRepository.updateStatus(natioalId, status);
			return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
			
		}//end catch()
		}//end updateStatusIndividualDTO()
	
	//update indi skill
	public  IndividualDTO updateSkillIndividualDTO (String natioalId, String skill) throws Exception{
		try{
			individualRepository.updateSkill(natioalId, skill);
			return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
			
		}//end catch()
		}//end updateSkillIndividualDTO()
	
	//update indi attachment
	public  IndividualDTO updateAttachmentIndividualDTO (String natioalId, String attachment) throws Exception{
		try{
			individualRepository.updateAttachment(natioalId, attachment);
			return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
			
		}//end catch()
		}//end updateAttachmentIndividualDTO()
	
	//update indi email
	public  IndividualDTO updateEmailIndividualDTO (String natioalId, String email) throws Exception{
		try{
			individualRepository.updateEmail(natioalId, email);
			return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
			
		}//end catch()
		
		}//end updateEmailIndividualDTO()
	
	//update indi phone Number
	public  IndividualDTO updatePhoneNumberIndividualDTO (String natioalId, String phoneNumber) throws Exception{
		try{
			individualRepository.updatePhoneNumber(natioalId, phoneNumber);
			return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
			
		}//end catch()
		}//end updatePhoneNumberIndividualDTO()
	
	
	//update indi address
		public  IndividualDTO updateAddressIndividualDTO (String natioalId, String address) throws Exception{
			try{
				individualRepository.updateAddress(natioalId, address);
				return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

			}catch(NoSuchElementException ex)
			{
				throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
				
			}//end catch()
			}//end updateAddressIndividualDTO()
		
	//update indi pass 
	public  IndividualDTO updatePasswordIndividualDTO (String natioalId, String password) throws Exception{
		try{
			individualRepository.updatePassword(natioalId, password);
			return individualRepository.findById(natioalId).map(individualMapper::domainToDto).get();

		}catch(NoSuchElementException ex)
		{
			throw new NotFoundException (String.format("No Record with the id [%s] was found in our database", natioalId));
			
		}//end catch()
		}//end updatePasswordIndividualDTO()
	
	
	
	//get individual 
	public IndividualDTO getById(String nationalId) {
		try {
			return individualRepository.findById(nationalId).map(individualMapper::domainToDto).get();
		}catch(NoSuchElementException ex) {
			throw new NotFoundException (String.format("No record", nationalId));
		}//end catch()
		
	}//end getById()
	
	//Deleting Individual
	public void deleteIndividual(String ID) {
		Individual existingIndividual = findById(ID);  
		individualRepository.deleteById(ID);
		individualMapper.domainToDto(existingIndividual); 
	}//end deleteIndividual()



//todo try to understand and delete
	private Individual findById(String ID) {
		try {
			return individualRepository.findById(ID).get();
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", ID));
		}
	}//end findById()
	
}//end class 

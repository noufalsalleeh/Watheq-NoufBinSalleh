package com.Watheq.Watheq.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.ExperienceDTO;
import com.Watheq.Watheq.exception.NotFoundException;
import com.Watheq.Watheq.mapperImp.ExperienceMapperImp;
import com.Watheq.Watheq.model.Experience;
import com.Watheq.Watheq.repository.ExperienceRepository;

@Service
public class ExperienceService {
	@Autowired
	ExperienceRepository experienceRepository;
	private static final ExperienceMapperImp experienceMapper = new ExperienceMapperImp();
	
	public ExperienceDTO createExperienceDTO(ExperienceDTO experienceDTO) {
		Experience experience = Experience.builder()
				.nationalId(experienceDTO.getNationalId())
				.companyRefrence(experienceDTO.getCompanyRefrence())
				.educationInstitutionId(experienceDTO.getEducationInstitutionId())
				.companyName(experienceDTO.getCompanyName())
				.experincePosition(experienceDTO.getExperincePosition())
                .startDate(experienceDTO.getStartDate())
                .endDate(experienceDTO.getEndDate())
                .addBy(experienceDTO.getAddBy())
                .refrenceName(experienceDTO.getRefrenceName())
                .refrenceEmail(experienceDTO.getRefrenceEmail())
                .build();
		
		
		Experience saveExperience = experienceRepository.save(experience);
        return experienceMapper.domainToDto(saveExperience);
    }//end createExperienceDTO()
	
	public ExperienceDTO getById(Long id) {
        try {
            return experienceRepository.findById(id).map(experienceMapper::domainToDto).get();
        }catch (NoSuchElementException ex) {
            throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
        }//end  catch
    }//end getById()
}//end class 

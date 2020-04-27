package com.Watheq.Watheq.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.LanguageDTO;
import com.Watheq.Watheq.exception.NotFoundException;
import com.Watheq.Watheq.mapperImp.LanguageMapperImp;
import com.Watheq.Watheq.model.Language;
import com.Watheq.Watheq.repository.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	LanguageRepository languageRepository;
	private static final LanguageMapperImp languageMapper = new LanguageMapperImp();

	public LanguageDTO createLanguageDTO(LanguageDTO languageDTO) {
		Language language = Language.builder()
				.nationalId(languageDTO.getNationalId())
				.langugeName(languageDTO.getLangugeName())
                .addBy(languageDTO.getAddBy())
                .langugeDate(languageDTO.getLangugeDate())
                .langugeRefrenceNo(languageDTO.getLangugeRefrenceNo())
                .durationValid(languageDTO.getDurationValid())
                .langugeAttach(languageDTO.getLangugeAttach())  
                .build();
		
		Language saveIndividual = languageRepository.save(language);
        return languageMapper.domainToDto(saveIndividual);
	}//end createLanguageDTO()
	
	public LanguageDTO getById(Long  id) {
		try {
			return languageRepository.findById(id).map(languageMapper::domainToDto).get();
		}catch(NoSuchElementException ex) {
			throw new NotFoundException (String.format("No record", id));
		}//end catch()
		
	}//end getById()
}//end class

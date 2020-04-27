package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.LanguageDTO;
import com.Watheq.Watheq.mapper.LanguageMapper;
import com.Watheq.Watheq.model.Language;

public class LanguageMapperImp implements LanguageMapper{
	ModelMapper modelMapper;

	public LanguageMapperImp() {
		modelMapper = new ModelMapper();
	}//LanguageMapperImp()
	@Override
	public Language dtoToDomain(LanguageDTO language) {
		return modelMapper.map(language,Language.class );

	}//end dtoToDomain()

	@Override
	public LanguageDTO domainToDto(Language language) {
		return modelMapper.map(language,LanguageDTO.class );

	}//end domainToDto()

}

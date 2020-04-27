package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.ExperienceDTO;
import com.Watheq.Watheq.mapper.ExperienceMapper;
import com.Watheq.Watheq.model.Experience;

public class ExperienceMapperImp implements ExperienceMapper{
	ModelMapper modelMapper;

	public ExperienceMapperImp() {
		modelMapper = new ModelMapper();
	}//ExperienceMapperImp()
	@Override
	public Experience dtoToDomain(ExperienceDTO experience) {
		return modelMapper.map(experience,Experience.class );

	}

	@Override
	public ExperienceDTO domainToDto(Experience experience) {
		return modelMapper.map(experience,ExperienceDTO.class );

	}

}

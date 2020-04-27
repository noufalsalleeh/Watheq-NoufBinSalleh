package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.IndividualDTO;
import com.Watheq.Watheq.mapper.IndividualMapper;
import com.Watheq.Watheq.model.Individual;



public class IndividualMapperImp implements IndividualMapper{



	ModelMapper modelMapper;

	public IndividualMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Individual dtoToDomain(IndividualDTO individual) {
		return modelMapper.map(individual,Individual.class );
		
	}//end dtoToDomain()

	@Override
	public IndividualDTO domainToDto(Individual individual) {
		return modelMapper.map(individual,IndividualDTO.class );

	
	}//end domainToDto()
}//end class

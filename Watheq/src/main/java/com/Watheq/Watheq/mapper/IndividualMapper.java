package com.Watheq.Watheq.mapper;


import com.Watheq.Watheq.dto.IndividualDTO;
import com.Watheq.Watheq.model.Individual;


//(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel= "spring")
public interface IndividualMapper {

	
	Individual dtoToDomain(final IndividualDTO individual );

	IndividualDTO domainToDto(final Individual individual );
}//end interface 

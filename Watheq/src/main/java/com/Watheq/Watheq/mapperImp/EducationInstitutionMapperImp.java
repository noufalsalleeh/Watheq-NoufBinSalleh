package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.EducationInstitutionDTO;
import com.Watheq.Watheq.mapper.EducationInstitutionMapper;
import com.Watheq.Watheq.model.EducationInstitution;

public class EducationInstitutionMapperImp implements EducationInstitutionMapper {
	ModelMapper modelMapper;

	public EducationInstitutionMapperImp() {
		modelMapper = new ModelMapper();
	}//endCertificateMapperImp()
	@Override
	public EducationInstitution dtoToDomain(EducationInstitutionDTO educationInstitution) {
		return modelMapper.map(educationInstitution,EducationInstitution.class );

	}

	@Override
	public EducationInstitutionDTO domainToDto(EducationInstitution educationInstitution) {
		return modelMapper.map(educationInstitution,EducationInstitutionDTO.class );

	}

}

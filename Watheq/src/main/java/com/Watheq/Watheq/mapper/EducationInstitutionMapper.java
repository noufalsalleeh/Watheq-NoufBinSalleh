package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.EducationInstitutionDTO;
import com.Watheq.Watheq.model.EducationInstitution;

public interface EducationInstitutionMapper {

	EducationInstitution dtoToDomain(final EducationInstitutionDTO educationInstitution );

	EducationInstitutionDTO domainToDto(final EducationInstitution educationInstitution );
}

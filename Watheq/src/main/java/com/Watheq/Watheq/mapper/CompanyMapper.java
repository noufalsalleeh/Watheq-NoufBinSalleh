package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.CompanyDTO;
import com.Watheq.Watheq.model.Company;

public interface CompanyMapper {
	
	Company dtoToDomain(final CompanyDTO company );

	CompanyDTO domainToDto(final Company company );

}//end interface

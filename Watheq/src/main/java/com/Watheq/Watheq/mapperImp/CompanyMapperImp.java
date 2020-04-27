package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.CompanyDTO;
import com.Watheq.Watheq.mapper.CompanyMapper;
import com.Watheq.Watheq.model.Company;

public class CompanyMapperImp implements CompanyMapper{
	ModelMapper modelMapper;

	public CompanyMapperImp() {
		modelMapper = new ModelMapper();
	}//endCertificateMapperImp()
	
	@Override
	public Company dtoToDomain(CompanyDTO company) {
		return modelMapper.map(company,Company.class );

	}//end dtoToDomain()

	@Override
	public CompanyDTO domainToDto(Company company) {
		return modelMapper.map(company,CompanyDTO.class );

	}//end domainToDto()

}//end class 

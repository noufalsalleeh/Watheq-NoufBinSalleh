package com.Watheq.Watheq.mapperImp;

import org.modelmapper.ModelMapper;

import com.Watheq.Watheq.dto.CertificateDTO;
import com.Watheq.Watheq.mapper.CertificateMapper;
import com.Watheq.Watheq.model.Certificate;

public class CertificateMapperImp implements CertificateMapper{
	ModelMapper modelMapper;

	public CertificateMapperImp() {
		modelMapper = new ModelMapper();
	}//endCertificateMapperImp()

	@Override
	public Certificate dtoToDomain(CertificateDTO certificate) {
		return modelMapper.map(certificate,Certificate.class );
	}//end dtoToDomain()

	@Override
	public CertificateDTO domainToDto(Certificate certificate) {
		return modelMapper.map(certificate,CertificateDTO.class );
	}//end domainToDto()
	
}//end class

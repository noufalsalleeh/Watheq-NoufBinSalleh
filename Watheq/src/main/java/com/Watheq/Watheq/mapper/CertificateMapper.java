package com.Watheq.Watheq.mapper;

import com.Watheq.Watheq.dto.CertificateDTO;
import com.Watheq.Watheq.model.Certificate;

public interface CertificateMapper { 
	
	Certificate dtoToDomain(final CertificateDTO certificate );

	CertificateDTO domainToDto(final Certificate certificate );
}//end class 

package com.Watheq.Watheq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Watheq.Watheq.dto.CertificateDTO;
import com.Watheq.Watheq.mapperImp.CertificateMapperImp;
import com.Watheq.Watheq.model.Certificate;
import com.Watheq.Watheq.repository.CertificateRepository;

@Service
public class CertificateService {
	@Autowired
	private CertificateRepository certificateRepository;

	private static final CertificateMapperImp  certificationmapper=new CertificateMapperImp();

	public CertificateDTO createCertificationDTO(CertificateDTO certificationDTO) {



		Certificate certification=Certificate.builder()
				.certificateId(certificationDTO.getCertificateId())
				.nationalId(certificationDTO.getNationalId())
				.eduInstitutionId(certificationDTO.getEducationInstitutionId())
				.universityName(certificationDTO.getUniversityName())
				.universityType(certificationDTO.getUniversityType())
				.addBy(certificationDTO.getAddBy())
				.graduationDate(certificationDTO.getGraduationDate())
				.gpa(certificationDTO.getGpa())
				.degree(certificationDTO.getDegree())
				.major(certificationDTO.getMajor())
				.build();



		Certificate saveCertification  = certificateRepository.save(certification);
		return certificationmapper.domainToDto(saveCertification);



	}//end createCertificationDTO()
}//end class

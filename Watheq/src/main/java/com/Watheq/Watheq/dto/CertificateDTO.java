package com.Watheq.Watheq.dto;

import java.sql.Date;


import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class CertificateDTO {

	private String certificateId;
	private Individual nationalId;
	private EducationInstitution universityName;
	private EducationInstitution universityType;
	private EducationInstitution educationInstitutionId;
	private String addBy;
	private Date graduationDate;
	private double gpa;
	private String degree;
	private String major;


	public CertificateDTO(String certificateId, Individual nationalId, EducationInstitution universityName,
			EducationInstitution universityType, EducationInstitution educationInstitutionId, String addBy,
			Date graduationDate, double gpa, String degree, String major) {
		this.certificateId = certificateId;
		this.nationalId = nationalId;
		this.universityName = universityName;
		this.universityType = universityType;
		this.educationInstitutionId = educationInstitutionId;
		this.addBy = addBy;
		this.graduationDate = graduationDate;
		this.gpa = gpa;
		this.degree = degree;
		this.major = major;
	}

}// end class

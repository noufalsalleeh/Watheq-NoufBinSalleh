package com.Watheq.Watheq.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EducationInstitutionDTO extends WatheqUserDTO{
	
	  private String educationInstitutionId;
	  
	  private String universityName;
	 
	  private String universityType;

	public EducationInstitutionDTO() {
		
	}



	public EducationInstitutionDTO(String educationInstitutionId, String universityName, String universityType) {
		this.educationInstitutionId = educationInstitutionId;
		this.universityName = universityName;
		this.universityType = universityType;
	}



	public EducationInstitutionDTO(String email, String phoneNumber, String address, String password,String educationInstitutionId, String universityName, String universityType) {
		super(email, phoneNumber, address, password);
		this.educationInstitutionId = educationInstitutionId;
		this.universityName = universityName;
		this.universityType = universityType;
	}  
	  
}//end class 

package com.Watheq.Watheq.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class EducationInstitution extends WatheqUser implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	

	@Id
	@NotNull(message = " Can't be Empty ")
	@Column(name = "eduInstitutionId", unique=true) 
	private String eduInstitutionId;

	@NotNull(message = " Can't be Empty ")
	@Column(name = "universityName")
	private String universityName;

	@NotNull(message = " Can't be Empty ")
	@Column(name = "universityType")
	private String universityType;

	public EducationInstitution() {
	}


	public EducationInstitution(String eduInstitutionId) {
		this.eduInstitutionId = eduInstitutionId;
	}




	public EducationInstitution(String eduInstitutionId, String universityName,String universityType) {
		
		this.eduInstitutionId = eduInstitutionId;
		this.universityName = universityName;
		this.universityType = universityType;
	}


	@Builder
	public EducationInstitution(String email, String phone_number, String address, String password, String eduInstitutionId,
			String universityName, String universityType) {
		super(email, phone_number, address, password);
		this.eduInstitutionId = eduInstitutionId;
		this.universityName = universityName;
		this.universityType = universityType;
	}





}//end class

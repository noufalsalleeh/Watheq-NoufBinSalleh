package com.Watheq.Watheq.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IndividualDTO extends WatheqUserDTO{

	private String nationalId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String gender;

	private String status;

	private String skill;

	private Date dateOfBirth;

	private String attachment;


	public IndividualDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IndividualDTO(String email, String phoneNumber, String address, String password, String nationalId, String firstName, String middleName, String lastName, String gender,
			String status, String skill, Date dateOfBirth, String attachment) {
		super( email, phoneNumber, address, password);
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.status = status;
		this.skill = skill;
		this.dateOfBirth = dateOfBirth;
		this.attachment = attachment;
	}


	
	
}//end class 

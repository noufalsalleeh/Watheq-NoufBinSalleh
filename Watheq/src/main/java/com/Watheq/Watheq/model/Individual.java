package com.Watheq.Watheq.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Individual extends WatheqUser implements Serializable  {

	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@NotNull(message = " Can't be Empty ")	
	@Column(name = "nationalId",unique= true)
	private String nationalId;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "firstName")
	private String firstName;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "middleName")
	private String middleName;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "lastName")
	private String lastName;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "gender")
	private String gender;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "status")
	private String status;

	@Column(name = "skill")
	private String skill;
	
	@NotNull(message = " Can't be Empty ")	
	@Column(name = "dateOfBirth")
	@Temporal(TemporalType.DATE)

	private Date dateOfBirth;

	
	@Column(name = "attachment")
	private String attachment;


	public Individual() {
	}//end Individual()


	public Individual(String nationalId) {
		super();
		this.nationalId = nationalId;
	}


	@Builder
	public Individual(String email, String phoneNumber, String address, String password, String nationalId, String firstName, String middleName, String lastName, String gender,
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
	}//end Individual()

}//end class 

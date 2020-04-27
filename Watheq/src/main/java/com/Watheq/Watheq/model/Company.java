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
public class Company extends WatheqUser implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;


	@Id
	@NotNull(message = " Can't be Empty ")	
	@Column(name = "companyRefrence", unique=true)
	private String companyRefrence;
	
	@NotNull(message = " Can't be Empty ")	
	@Column(name = "companyName")
	private String companyName;

	@Column(name = "startDate")
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name = "endDate")
	@Temporal(TemporalType.DATE)
	private Date endDate;


	public Company() {
		super();
	}




	@Builder
	public Company(String email, String phoneNumber, String address, String password, String companyRefrence, String companyname, 
			Date startDate, Date endDate) {

		super(email, phoneNumber, address, password);
		this.companyRefrence = companyRefrence;
		this.companyName = companyname;
		this.startDate = startDate;
		this.endDate = endDate;
	}





}//end class 

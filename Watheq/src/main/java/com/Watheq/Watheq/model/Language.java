package com.Watheq.Watheq.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Language  implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;

	@ManyToOne(fetch = FetchType.LAZY, optional=false,cascade= CascadeType.ALL )
	@JoinColumn (name= "nationalId", nullable= false)
	private Individual nationalId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long langugeId;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "langugeName")
	private String langugeName;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "addBy")
	private String addBy;

	@Column(name = "langugeDate")
	@Temporal(TemporalType.DATE)

	private Date langugeDate;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "langugeRefrenceNo")
	private String langugeRefrenceNo;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "durationValid")
	private String durationValid;

	@Column(name = "langugeAttach")
	private String langugeAttach;

	public Language() {
	}//end Language

	@Builder
	public Language(Individual nationalId, Long langugeId, String langugeName, String addBy, Date langugeDate,
			String langugeRefrenceNo, String durationValid, String langugeAttach) {
		this.nationalId = nationalId;
		this.langugeId = langugeId;
		this.langugeName = langugeName;
		this.addBy = addBy;
		this.langugeDate = langugeDate;
		this.langugeRefrenceNo = langugeRefrenceNo;
		this.durationValid = durationValid;
		this.langugeAttach = langugeAttach;
	}

}//end class 

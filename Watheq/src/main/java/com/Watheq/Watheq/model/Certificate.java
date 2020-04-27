package com.Watheq.Watheq.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Certificate  implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;


	@Id
	@Column(name = "certificateId", unique= true)
	private String certificateId;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "nationalId")
	private Individual nationalId;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "eduInstitutionId")
	private EducationInstitution eduInstitutionId;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "universityName")
	private EducationInstitution universityName;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "universityType")
	private EducationInstitution universityType;

	@NotNull(message = " Can't be Empty ")
	@Column(name = "addBy")
	private String addBy;
	
	@NotNull(message = " Can't be Empty ")
	@Column(name = "graduationDate")
	@Temporal(TemporalType.DATE)
	private Date graduationDate;
	
	@NotNull(message = " Can't be Empty ")
	@Column(name = "gpa")
	private Double gpa ;
	
	@NotNull(message = " Can't be Empty ")
	@Column(name = "degree")
	private String degree;
	
	@NotNull(message = " Can't be Empty ")
	@Column(name = "major")
	private String major;

	public Certificate() {
	}


	@Builder
	public Certificate(String certificateId, Individual nationalId, EducationInstitution eduInstitutionId,
			EducationInstitution universityName, EducationInstitution universityType, String addBy, Date graduationDate, Double gpa,
			String degree, String major) {

		this.certificateId = certificateId;
		this.nationalId = nationalId;
		this.eduInstitutionId = eduInstitutionId;
		this.universityName = universityName;
		this.universityType = universityType;
		this.addBy = addBy;
		this.graduationDate = graduationDate;
		this.gpa = gpa;
		this.degree = degree;
		this.major = major;
	}

	
}//end class 

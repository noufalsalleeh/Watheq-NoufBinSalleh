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
public class Experience implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long experienceId;

	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade= CascadeType.ALL)
	@JoinColumn (name= "companyRefrence")
	private Company companyRefrence;

	@ManyToOne(fetch = FetchType.LAZY, optional=false,cascade= CascadeType.ALL )
	@JoinColumn (name= "companyName")
	private Company companyName;

	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade= CascadeType.ALL)
	@JoinColumn (name= "nationalId")
	private Individual nationalId;

	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade= CascadeType.ALL)
	@JoinColumn (name= "educationInstitutionId")
	private EducationInstitution educationInstitutionId;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "experincePosition")
	private String experincePosition;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "startDate")
	@Temporal(TemporalType.DATE)

	private Date startDate;
	
	@NotNull(message = " Can't be Empty ")	
	@Column(name = "endDate")
	@Temporal(TemporalType.DATE)

	private Date endDate;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "addBy")
	private String addBy;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "refrenceName")
	private String refrenceName;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "refrenceEmail")
	private String refrenceEmail;


	public  Experience() {
		super();
	}//end Experience()

	@Builder
	public Experience(Long experienceId, Company companyRefrence, Company companyName, Individual nationalId,
			EducationInstitution educationInstitutionId, String experincePosition, Date startDate,
			Date endDate, String addBy, String refrenceName, String refrenceEmail) {
		super();
		this.experienceId = experienceId;
		this.companyRefrence = companyRefrence;
		this.companyName = companyName;
		this.nationalId = nationalId;
		this.educationInstitutionId = educationInstitutionId;
		this.experincePosition = experincePosition;
		this.startDate = startDate;
		this.endDate = endDate;
		this.addBy = addBy;
		this.refrenceName = refrenceName;
		this.refrenceEmail = refrenceEmail;
	}//end Experience()


	
}//end class 
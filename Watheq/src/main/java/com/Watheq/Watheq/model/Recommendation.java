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
public class Recommendation implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String recommendationId;

	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade= CascadeType.ALL)
	@JoinColumn (name= "nationalId")
	private Individual nationalId;

	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade= CascadeType.ALL)
	@JoinColumn (name= "companyRefrence")
	private Company companyRefrence;

	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade= CascadeType.ALL)
	@JoinColumn (name= "educationInstitutionId")
	private EducationInstitution educationInstitutionId;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "recommendationFrom")
	private String recommendationFrom;

	@Column(name = "recommendationDate")
	@Temporal(TemporalType.DATE)
	private Date recommendationDate;

	@Column(name = "recommendationAddBy")
	private String recommendationAddBy;

	@NotNull(message = " Can't be Empty ")	
	@Column(name = "recommendationAttach")
	private String recommendationAttach;


	public Recommendation() {
	}//end Recommendation()

	@Builder
	public Recommendation(String recommendationId, Individual nationalId, Company companyRefrence,
			EducationInstitution educationInstitutionId, String recommendationFrom, Date recommendationDate,
			String recommendationAddBy, String recommendationAttach) {
		this.recommendationId = recommendationId;
		this.nationalId = nationalId;
		this.companyRefrence = companyRefrence;
		this.educationInstitutionId = educationInstitutionId;
		this.recommendationFrom = recommendationFrom;
		this.recommendationDate = recommendationDate;
		this.recommendationAddBy = recommendationAddBy;
		this.recommendationAttach = recommendationAttach;
	}
}//end class

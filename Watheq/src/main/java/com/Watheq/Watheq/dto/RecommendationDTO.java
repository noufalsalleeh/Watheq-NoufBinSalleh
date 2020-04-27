package com.Watheq.Watheq.dto;

import java.sql.Date;


import com.Watheq.Watheq.model.Company;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class RecommendationDTO {
	
	private Individual nationalId;
	private Company companyRefrence;
	private EducationInstitution educationInstitutionId;
	private String recommendationFrom;
	private Date recommendationDate;
	private String recommendationAddBy;
	private String recommendationAttach;
	private String recommendationInstituteName;
	
	public RecommendationDTO() {
	}

	public RecommendationDTO(Individual nationalId, Company companyRefrence,
			EducationInstitution educationInstitutionId, String recommendationFrom, Date recommendationDate,
			String recommendationAddBy, String recommendationAttach, String recommendationInstituteName) {
		super();
		this.nationalId = nationalId;
		this.companyRefrence = companyRefrence;
		this.educationInstitutionId = educationInstitutionId;
		this.recommendationFrom = recommendationFrom;
		this.recommendationDate = recommendationDate;
		this.recommendationAddBy = recommendationAddBy;
		this.recommendationAttach = recommendationAttach;
		this.recommendationInstituteName = recommendationInstituteName;
	}

	
}//end class 

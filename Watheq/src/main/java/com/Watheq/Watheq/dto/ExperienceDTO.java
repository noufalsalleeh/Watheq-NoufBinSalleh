package com.Watheq.Watheq.dto;

import java.sql.Date;



import com.Watheq.Watheq.model.Company;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ExperienceDTO {
	

	private Company companyRefrence;

	private Company companyName;

	private Individual nationalId;

	private EducationInstitution educationInstitutionId;

	private String experincePosition;

	

	private Date startDate;

	private Date endDate;

	private String addBy;

	private String refrenceName;

	private String refrenceEmail;


	public ExperienceDTO() {
	}

	public ExperienceDTO(Company companyRefrence, Company companyName, Individual nationalId,
			EducationInstitution educationInstitutionId, String experincePosition, Date startDate,
			Date endDate, String addBy, String refrenceName, String refrenceEmail) {
		super();
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
	}

}//end class

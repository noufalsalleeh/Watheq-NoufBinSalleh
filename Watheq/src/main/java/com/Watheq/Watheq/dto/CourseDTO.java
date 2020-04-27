package com.Watheq.Watheq.dto;

import java.sql.Date;

import com.Watheq.Watheq.model.Company;
import com.Watheq.Watheq.model.EducationInstitution;
import com.Watheq.Watheq.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class CourseDTO {
	
	private String courseId;
	private Individual nationalId;
	private Company companyRefrence;
	private EducationInstitution EducationInstitutionId;


	private String nameCourse;

	private String addedBy;

	private Date startDate;

	private Date endDate;

	private String nameInstittion;

	private String courseAttach;

	
	public CourseDTO() {
	}


	public CourseDTO(String courseId, Individual nationalId, Company companyRefrence,
			EducationInstitution EducationInstitutionId, String nameCourse, String addedBy, Date startDate,
			Date endDate, String nameInstittion, String courseAttach) {
		this.courseId = courseId;
		this.nationalId = nationalId;
		this.companyRefrence = companyRefrence;
		this.EducationInstitutionId = EducationInstitutionId;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.startDate = startDate;
		this.endDate = endDate;
		this.nameInstittion = nameInstittion;
		this.courseAttach = courseAttach;
	}

	
}// end class

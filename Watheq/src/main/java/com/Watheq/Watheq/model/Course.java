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
public class Course implements Serializable {
	 
	  private static final long serialVersionUID = -3009157732242241606L;
	  

		@Id
		@Column(name = "courseId")
		private String courseId;

		@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
		@JoinColumn(name= "nationalId")
		private Individual nationalId;

		@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
		@JoinColumn(name= "companyRefrence")
		private Company companyRefrence;

		@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
		@JoinColumn(name= "eduInstitutionId")
		private EducationInstitution eduInstitutionId;

		@NotNull(message = " Can't be Empty ")	
		@Column(name = "nameCourse")
		private String nameCourse;

		@Column(name = "addedBy")
		private String addedBy;
		
		@NotNull(message = " Can't be Empty ")	
		@Column(name = "nameInstittion")
		private String nameInstittion;

		@Column(name = "courseAttach")
		private String courseAttach;
		
		@NotNull(message = " Can't be Empty ")	
		@Column(name = "startDate")
		@Temporal(TemporalType.DATE)

		private Date startDate;

		@Column(name = "endDate")
		@Temporal(TemporalType.DATE)

		private Date endDate;

		public Course() {
		}
		
		@Builder
		public Course(String courseId, Individual nationalId, Company companyRefrence,
				EducationInstitution eduInstitutionId, String nameCourse, String addedBy, String nameInstittion,
				String courseAttach, Date startDate, Date endDate) {
			this.courseId = courseId;
			this.nationalId = nationalId;
			this.companyRefrence = companyRefrence;
			this.eduInstitutionId = eduInstitutionId;
			this.nameCourse = nameCourse;
			this.addedBy = addedBy;
			this.nameInstittion = nameInstittion;
			this.courseAttach = courseAttach;
			this.startDate = startDate;
			this.endDate = endDate;
		}
		
}//end class

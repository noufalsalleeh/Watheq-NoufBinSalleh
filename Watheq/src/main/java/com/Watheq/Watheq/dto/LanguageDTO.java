package com.Watheq.Watheq.dto;

import java.sql.Date;



import com.Watheq.Watheq.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class LanguageDTO {

	private Individual nationalId;

	private String langugeName;

	private String addBy;

	private Date langugeDate;

	private String langugeRefrenceNo;


	private String durationValid;

	private String langugeAttach;

	public LanguageDTO() {
	}



	public LanguageDTO(Individual nationalId, String langugeName, String addBy, Date langugeDate,
			String langugeRefrenceNo, String durationValid, String langugeAttach) {
		this.nationalId = nationalId;
		this.langugeName = langugeName;
		this.addBy = addBy;
		this.langugeDate = langugeDate;
		this.langugeRefrenceNo = langugeRefrenceNo;
		this.durationValid = durationValid;
		this.langugeAttach = langugeAttach;
	}

}//end class 


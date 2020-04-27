package com.Watheq.Watheq.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompanyDTO extends WatheqUserDTO{
	
		private String companyRefrence;
		private String companyName;
		private Date startDate;
		private Date endDate;
		
		public CompanyDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		public CompanyDTO(String email, String phoneNumber, String address, String password, String companyRefrence, String companyName, Date startDate, Date endDate) {
			super( email, phoneNumber, address, password);
			this.companyRefrence = companyRefrence;
			this.companyName = companyName;
			this.startDate = startDate;
			this.endDate = endDate;
		}
	
}//end class 

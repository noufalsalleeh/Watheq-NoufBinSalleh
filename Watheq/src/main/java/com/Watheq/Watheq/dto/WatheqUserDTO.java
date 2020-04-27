package com.Watheq.Watheq.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WatheqUserDTO {


	public WatheqUserDTO() {
	}

	private String email;

	private String phoneNumber;

	private String address;

	private String password;


	public WatheqUserDTO(String email, String phoneNumber, String address, String password) {
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}

}//end class 

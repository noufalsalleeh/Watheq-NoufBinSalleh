package com.Watheq.Watheq.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;






//@Entity
//@Table(name = "watheqUser")
@MappedSuperclass
@Setter
@Getter
public class WatheqUser implements Serializable{

	private static final long serialVersionUID = -3009157732242241606L;

	
	
	@NotNull(message = " Can't be Empty ")	
	@Column(name = "email")
	@Email (message="not valid ")
	private String email;

	@NotNull(message = " Can't be Empty ")	
	/*
	 * @Pattern(regexp="(^0-9}*")
	 */	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "address")
	private String address;
	
	@Column(name = "password")
	private String password;

	public WatheqUser() {
		super();
	}//end User()

	
	public WatheqUser(String email, String phoneNumber, String address, String password) {
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}//end WatheqUser()

}//end class

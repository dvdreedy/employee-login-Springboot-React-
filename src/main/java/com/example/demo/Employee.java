package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Data;

@Data
@Entity

public class Employee {

	private @Id @GeneratedValue Long id;
	@NotNull
	@Size(min=2,max=35)
	private String firstName;
	@NotNull
	@Size(min=2,max=35)
	private String lastName;
	@NotNull
	@Size(min=10,max=50)
	private String address;
	@NotNull
	@Size(min=5,max=50)
	private String city;
	@NotNull
	@Size(min=2,max=2)
	private String state;
	@NotNull
	@Size(min=10,max=10)
	private String homePhone;
	@NotNull
	@Size(min=10,max=10)
	private String cellPhone;
	@NotNull
	@Size(min=5,max=9)
	private String zip;
	@NotNull
	@Size(min=10,max=50)
	private String email;
	

private Employee() {}

	public Employee(String firstName, String lastName, String address,String city,String state,String homePhone,String cellPhone,String zip,String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = firstName;
		this.city = city;
		this.state = state;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.zip = zip;
		this.email = email;
	}
}
package com.gl.model;

import com.gl.services.CredentialService;

public class Employee {
	private String firstName = "";
	private String lastName = "";

	private String email = "";
	private String password = "";

	private String dept = "";

	public Employee(String firstNameString, String lastNameString, String dept, int passwordStrength) {
		firstName = firstNameString;
		lastName = lastNameString;
		this.dept = dept;

		this.email = CredentialService.generateEmail(firstNameString, lastNameString, dept);
		this.password = CredentialService.generatePassword(passwordStrength);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getDept() {
		return dept;
	}

}

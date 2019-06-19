package com.diviso.JunitTest;

import java.time.LocalDate;

public class Person {

	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate dob;
	public String getFirstName() {
		return firstName;
	}
	public Person(String firstName, String lastName, Gender gender, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}

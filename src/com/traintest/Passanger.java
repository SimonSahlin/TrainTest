package com.traintest;

public class Passanger {

	private int age; 
	private String firstName; 
	private String lastName; 
	private String payed;
	
	public Passanger (String firstName, String lastName, int age, String payed) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName; 
		this.payed = payed;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge () {
		return age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName; 
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName; 
	}
	public String getPayed() {
		return payed;
	}
	public void setPayed(String payed) {
		this.payed = payed;
	}

	@Override
	public String toString () {
		return "Biljett för passagerare: " + getFirstName() + " " + getLastName() + ". Ålder: " + getAge() + ". "+ getPayed(); 
	}
	
}

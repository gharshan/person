package com.gharshan.person.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	private int age;
	
	@JsonProperty("favourite_colour")
	private String favouriteColour;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavouriteColour() {
		return favouriteColour;
	}

	public void setFavouriteColour(String favouriteColour) {
		this.favouriteColour = favouriteColour;
	}
	
	
	@Override
	public int hashCode() {
		return firstName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		return obj!=null && this.getFirstName().equals(((Person)obj).getFirstName());
	}
}

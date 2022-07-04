package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1 ,message="is required")
	private String lastName;
	
	private String country;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@NotNull(message="is required")
	@Min(value=0,message="Value must be greater than or equal to 0")
	@Max(value=10,message="Value must be less than or equal to 10")
	private Integer freePass;
	
	
	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	private LinkedHashMap<String,String> countryOptions;
	
	

	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
		
		
		  countryOptions = new LinkedHashMap<>();
		  
		  countryOptions.put("IN","India"); 
		  countryOptions.put("BR","Brazil");
		  countryOptions.put("FR","France"); 
		  countryOptions.put("GR","Germany");
		  countryOptions.put("US","United States");
		 
		
	}

	
	 public LinkedHashMap<String, String> getCountryOptions() { return
	 countryOptions; }
	 

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}

package com.JAVASAMPLE.SpringBootApplication.repository;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Component
public class UserRequest {
	
	@NotNull(message = "FirstName shouldn't be null")
	private String fname;
	
	@NotNull(message = "Lastname shouldn't be null")
	private String lname;
	
	@NotNull(message = "Gender shouldn't be null")
	private String gender;
	
	@NotNull
	//Mobile Number must contain 10 digits
	@Pattern(regexp = "^\\d{10}$", message="Invalid Mobile Number Entered")
	private String mobile;

	@NotNull
	@Email(message= "Invalid email")
	private String mail;
	
	@NotNull
	//Password should be with at least one digit,
	//one upper case letter, one lower case letter and one special symbol (“@#$%”).
	@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15}$", message = "Invalid Password")
	private String password;
	
	@NotNull(message = "City shouldn't be null")
	private String city;
	
	@NotNull(message = "Age shouldn't be null")
	@Min(18)
	@Max(60)
	private Integer age;
	
	@NumberFormat
	@NotNull(message="pincode should not be null")
	private Integer pincode;
	
	public String getFName() {
		return fname;
	}

	public void setFName(String fname) {
		this.fname = fname;	
	}
	
	public String getLName() {
		return lname;
	}
	public void setLName(String lname) {
		this.lname = lname;	
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;	
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;	
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;	
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;	
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;	
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;	
	}
	
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;	
	}

	public UserRequest(@NotNull(message = "FirstName shouldn't be null") String fname, 
			           @NotNull(message = "LastName shouldn't be null") String lname,
			           @NotNull(message = "Gender shouldn't be null") String gender,
			           @NotNull(message = "Invalid Mobile Number Entered") String mobile,
			           @NotNull(message = "Invalid email") String mail,
			           @NotNull(message = "Invalid Password") String password,
			           @NotNull(message = "City shouldn't be null") String city,
			           @NotNull(message = "Age shouldn't be null") Integer age,
			           @NotNull(message = "pincode should not be null") Integer pincode) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.mobile = mobile;
		this.mail = mail;
		this.password = password;
		this.city = city;
		this.age = age;
		this.pincode = pincode;
	}
}

package com.JAVASAMPLE.SpringBootApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
@Table(name="User_Details")

public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String fname;
	private String lname;
	private String gender;
	private String mobile;
	private String mail;
	private String password;
	private String city;
	private Integer age;
	private Integer pincode;
	
	public Integer getId() {
		return id;
		}
	public void setId(Integer id) {
		this.id = id;	
		}
	
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

	public User(Integer id,String fname, String lname, String gender, String mobile, 
			String mail, String password, String city, Integer age, Integer pincode) {
		
		super();
		this.id = id;
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
	public User() {
		super();
	}
}

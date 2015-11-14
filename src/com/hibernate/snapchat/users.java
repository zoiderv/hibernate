package com.hibernate.snapchat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.w3c.dom.Text;

@Entity
@Table(name="users")
public class users {
	
	@Id
	private int rollNo;
	private int user_id;
	private Text firstname;
	private Text lastname;
	private double email;
	private double password;
	private double birth_date;
	private int phone_number;
	private int val_code;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Text getFirstname() {
		return firstname;
	}
	public void setFirstname(Text firstname) {
		this.firstname = firstname;
	}
	public Text getLastname() {
		return lastname;
	}
	public void setLastname(Text lastname) {
		this.lastname = lastname;
	}
	public double getEmail() {
		return email;
	}
	public void setEmail(double email) {
		this.email = email;
	}
	public double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}
	public double getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(double birth_date) {
		this.birth_date = birth_date;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getVal_code() {
		return val_code;
	}
	public void setVal_code(int val_code) {
		this.val_code = val_code;
	}
	
	
	}

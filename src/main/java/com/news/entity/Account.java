package com.news.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "FIRST_NAME")
	private int firstName;

	@Column(name = "LAST_NAME")
	private int lastName;
	
	@Column(name = "ROLE")
	private int role;
	
	@Column(name = "DATE_CREATE")
	private int dataCreate;

	public Account(String userName, String password, int firstName, int lastName, int role, int dataCreate) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.dataCreate = dataCreate;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFirstName() {
		return firstName;
	}

	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}

	public int getLastName() {
		return lastName;
	}

	public void setLastName(int lastName) {
		this.lastName = lastName;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getDataCreate() {
		return dataCreate;
	}

	public void setDataCreate(int dataCreate) {
		this.dataCreate = dataCreate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

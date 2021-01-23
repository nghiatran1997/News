package com.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEWS")
public class News {
	@Id
	@Column(name = "NEWS_ID")
	private String newID;
	
	@Column(name = "CATEGORY_ID")
	private String CATEGORY_ID;
	
	@Column(name = "USER_NAME")
	private int userName;

	@Column(name = "TITLE")
	private int title;
	
	@Column(name = "SUBSTANCE_ID")
	private int substanceId;
	
	@Column(name = "DATE_CREATE")
	private int dataCreate;

	public String getNewID() {
		return newID;
	}

	public void setNewID(String newID) {
		this.newID = newID;
	}

	public String getCATEGORY_ID() {
		return CATEGORY_ID;
	}

	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public int getSubstanceId() {
		return substanceId;
	}

	public void setSubstanceId(int substanceId) {
		this.substanceId = substanceId;
	}

	public int getDataCreate() {
		return dataCreate;
	}

	public void setDataCreate(int dataCreate) {
		this.dataCreate = dataCreate;
	}

	public News(String newID, String cATEGORY_ID, int userName, int title, int substanceId, int dataCreate) {
		super();
		this.newID = newID;
		CATEGORY_ID = cATEGORY_ID;
		this.userName = userName;
		this.title = title;
		this.substanceId = substanceId;
		this.dataCreate = dataCreate;
	}
	public News() {
		// TODO Auto-generated constructor stub
	}
}

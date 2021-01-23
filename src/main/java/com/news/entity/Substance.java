package com.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUBSTANCE")
public class Substance {
	@Id
	@Column(name = "SUBTANCE_ID")
	private String substanceId;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "CONTENT")
	private int content;

	@Column(name = "ORDER")
	private int order;
	
	@Column(name = "DATE_CREATE")
	private int dataCreate;
}

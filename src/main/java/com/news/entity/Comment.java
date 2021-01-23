package com.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMENT")
public class Comment {
	
	@Id
	@Column(name = "NumberID")
	private int numberId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "NEWS_ID")
	private String newId;
	
	@Column(name = "COMMENT_CONTENT")
	private int commentContent;

}

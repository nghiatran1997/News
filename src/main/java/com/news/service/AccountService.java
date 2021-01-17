package com.news.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.news.entity.Account;

@Component
public interface AccountService {

	public Account getOne(String userName);
	
	public List<Account> findAll();
}

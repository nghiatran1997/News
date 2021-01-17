package com.news.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.entity.Account;
import com.news.repository.AccountRepo;
import com.news.service.AccountService;

@Service
public class AcountServiceImp implements AccountService{

	@Autowired
	AccountRepo accountRepo;
	
	public Account getOne(String userName) {
		return accountRepo.findById(userName).orElse(null);
	}
	
	public List<Account> findAll() {
		return accountRepo.findAll();
	}
	
	
}

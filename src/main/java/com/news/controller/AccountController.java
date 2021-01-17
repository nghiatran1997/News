package com.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.news.entity.Account;
import com.news.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping("account")
	@ResponseBody
	public Account getOne(@RequestParam("userName") String userName) {
		return accountService.getOne(userName);
	}
	@GetMapping("/")
	@ResponseBody
	public List<Account> getAll() {
		return accountService.findAll();
	}
}

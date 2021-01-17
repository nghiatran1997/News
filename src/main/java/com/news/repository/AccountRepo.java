package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {
		
	
	

}

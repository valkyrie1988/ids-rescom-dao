package com.ids.rescom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.rescom.entities.account.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
	public Account findById(Long id);
}

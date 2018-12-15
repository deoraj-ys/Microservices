package com.employee.data.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

	Account findByUsername(String string);
	  
	  

}

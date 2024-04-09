package com.easybank.accounts.repositories;

import com.easybank.accounts.entities.Accounts;
import com.easybank.accounts.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    
}

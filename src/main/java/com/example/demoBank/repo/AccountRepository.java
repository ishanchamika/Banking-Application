package com.example.demoBank.repo;

import com.example.Banking.App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

//public class AccountRepository extends JpaRepository<Account, long> {
//}

public interface AccountRepository extends JpaRepository<Account, Long>{
}
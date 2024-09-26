package com.example.demoBank.service;

import com.example.demoBank.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService
{
    public Account createAccount(Account account);
    public Account getAccountDetailsByAccountNumber(Long accountNumber);
    public List<Account> getAllAccountDetails();
    public Account depositAmount(Long accountNumber, Double amount);
    public Account withdrawaAmount(Long accountNumber, Double amount);
    public void closeAccount(Long accountNumber);
}

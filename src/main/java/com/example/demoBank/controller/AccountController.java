package com.example.demoBank.controller;

import com.example.demoBank.entity.Account;
import com.example.demoBank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController
{
    @Autowired
    AccountService service;
    //create account
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account)
    {
       Account createAccount =  service.createAccount(account);
       return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);
    }

    @GetMapping("/{accountNumber}")
    public Account getAccountByAccountNumber(@PathVariable Long accountNumber)
    {
        Account account = service.getAccountDetailsByAccountNumber(accountNumber);
        return account;
    }

    @GetMapping("/getallaccounts")
    public List<Account> getAllAccountDetauls()
    {
        List<Account> allAccountDetails = service.getAllAccountDetails();
        return allAccountDetails;
    }

    @PutMapping("/deposit/{accountNumber}/{amount}")
    public Account depositAccount(@PathVariable Long accountNumber, @PathVariable Double amount)
    {
        Account account = service.depositAmount(accountNumber, amount);
        return account;
    }

    @PutMapping("/withdrawa/{accountNumber}/{amount}")
    public Account withdrawaAccount(@PathVariable Long accountNumber, @PathVariable Double amount)
    {
        Account account = service.withdrawaAmount(accountNumber, amount);
        return  account;
    }

    @DeleteMapping("delete/{accountNumber}")
    public ResponseEntity deleteAccount(@PathVariable Long accountNumber)
    {
        service.closeAccount(accountNumber);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Account closed");
    }
}

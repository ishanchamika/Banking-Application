package com.example.demoBank.controller;

import com.example.demoBank.entity.Account;
import com.example.demoBank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController
{
    @Autowired
    AccountService service;
    //create account
    @PostMapping("create/")
    public Account createAccount(@RequestBody Account account)
    {
       Account createAccount =  service.createAccount(account);
       return createAccount;
    }
}

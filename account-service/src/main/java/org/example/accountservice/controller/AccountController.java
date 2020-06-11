package org.example.accountservice.controller;

import org.example.accountservice.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    private static List<Account> list;

    @PostConstruct
    public void init()
    {
        list=new ArrayList<Account>();
        list.add(new Account(1,"Ayush",true));
        list.add(new Account(2,"siddharth",true));
        list.add(new Account(3,"ramandeep",true));
        list.add(new Account(4,"Cobu",false));
        list.add(new Account(5,"Amol",false));
        list.add(new Account(6,"Guri",true));
        list.add(new Account(7,"Handa",true));
        list.add(new Account(8,"Mehul",false));




    }

    @GetMapping("/accounts")
    public List<Account> getAccount()
    {
        return list;
    }
}

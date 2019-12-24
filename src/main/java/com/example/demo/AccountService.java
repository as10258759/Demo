package com.example.demo;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    OnlineAccountRepository onlineaccountRepository;


    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account retrieveAccount( long id) {

        return accountRepository.getOne(id);
    }
    public String login(String string) {
        Gson gson = new Gson();
        Account FromLogin = gson.fromJson(string, Account.class);
        if (accountRepository.existsById(FromLogin.getUserid())) {
            Account FromDB = accountRepository.getOne(FromLogin.getUserid());
            if (FromLogin.getPassword().equals(FromDB.getPassword())) {
                onlineaccountRepository.save(new OnlineAccount(FromLogin.getUserid(),FromLogin.getPassword()));
                return "login sucess";
            } else {
                return "password invalid";
            }
        } else {
            return "account not found";
        }
    }

    public String logout(String string) {
        Gson gson = new Gson();
        Account clientaccount = gson.fromJson(string, Account.class);
        if(onlineaccountRepository.existsById(clientaccount.getUserid()))
        {
            onlineaccountRepository.deleteById(clientaccount.getUserid());
            return "logout success";
        }else {
            return "time out";
        }
    }
}

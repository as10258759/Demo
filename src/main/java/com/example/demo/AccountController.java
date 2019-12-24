package com.example.demo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    AccountService service;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return   service.getAllAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account retrieveAccount(@PathVariable long id) {
        return service.retrieveAccount(id);
    }


//    {   前端電文
//        "userid": "12132", "password": "12321"
//    }

    @PostMapping("/login")
    public String login(@RequestBody String loginAccountjson) {
        return service.login(loginAccountjson);
    }

    @PostMapping("/logout")
    public String logout(@RequestBody String logoutAccountjson) {
     return service.logout(logoutAccountjson);
    }

}

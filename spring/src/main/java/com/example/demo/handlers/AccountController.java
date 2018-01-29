package com.example.demo.handlers;

import com.example.demo.models.Account;
import com.example.demo.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class AccountController {

    private AccountService accountService;

    @GetMapping("/accounts")
    public Flux<Account> getAccounts() {
        return accountService.getAll();
    }

    @PostMapping("/accounts")
    public Mono<Account> save(@RequestBody Account account) {
        return accountService.add(account);
    }
}
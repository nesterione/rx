package com.example.demo.services;

import com.example.demo.models.Account;
import com.example.demo.repositories.TransactionsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class AccountService {

    private TransactionsRepository transactionsRepository;

    public Flux<Account> getAll() {
        return transactionsRepository
                .findAll()
                .log();
    }

    public Mono<Account> add(Account account) {
        return transactionsRepository
                .save(account)
                .log();
    }

//    public Flux<Account> find() {
//        return transactionsRepository
//                .findAll()
//                .log()
//                .take(2);
//    }
}
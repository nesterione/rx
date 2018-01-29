package com.example.demo.repositories;

import com.example.demo.models.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransactionsRepository extends ReactiveMongoRepository<Account, String> {
}

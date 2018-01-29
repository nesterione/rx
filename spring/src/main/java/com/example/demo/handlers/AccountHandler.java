package com.example.demo.handlers;

import com.example.demo.models.Account;
import com.example.demo.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@AllArgsConstructor
public class AccountHandler {

    private AccountService accountService;

    public Mono<ServerResponse> getUsers(ServerRequest request) {
        return ok().body(accountService.getAll(), Account.class);
    }

    public Mono<ServerResponse> save(ServerRequest request ) {
        return ok()
               .body(
                       accountService.add(
                               request
                                       .bodyToMono(Account.class)
                                       .log()
                                       .block()
                       ), Account.class);
    }
}

//request.bodyToMono(Account.class).log().doOnSuccess((account)->ok().build()).subscribe(accountService::add);

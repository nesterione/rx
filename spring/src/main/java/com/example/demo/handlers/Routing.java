package com.example.demo.handlers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class Routing {

    @Bean
    public RouterFunction<ServerResponse> hello(EchoHandler echoHandler) {
        return route(GET("/hello"),
                (req)-> ServerResponse
                        .ok()
                        .body(Mono.just("Hello,Spring!"), String.class)
        );
    }

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(EchoHandler echoHandler) {
        return route(POST("/echo"), echoHandler::echo);
    }

//    @Bean
//    public RouterFunction<ServerResponse> accounts(AccountHandler transactionsHandler) {
//        return nest(path("/accounts"),
//                route(
//                        GET("/"), transactionsHandler::getUsers).andRoute(
//                        POST("/"), transactionsHandler::save)
//        );
//    }
}

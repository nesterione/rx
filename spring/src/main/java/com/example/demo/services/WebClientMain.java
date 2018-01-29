package com.example.demo.services;

import org.springframework.http.HttpHeaders;
import org.springframework.util.Base64Utils;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientMain {

    public static void main(String[] args) {
//
//        WebClient webClient = WebClient.builder()
//                .baseUrl("https://api.github.com")
//                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/vnd.github.v3+json")
//                .defaultHeader(HttpHeaders.USER_AGENT, "Spring 5 WebClient")
//                .build();
//
//        return webClient.get()
//                .uri("/user/repos")
//                .header("Authorization", "Basic " + Base64Utils
//                        .encodeToString((username + ":" + token).getBytes(UTF_8)))
//                .retrieve()
//                .bodyToFlux(GithubRepo.class);
    }
}

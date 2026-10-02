package com.dayx.planservice;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class TipsClient {

    private final RestClient restClient;

    public TipsClient() {
        this.restClient = RestClient.create("http://localhost:8081");
    }

    public List<TipResponse> getTips(String category) {

        return restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/tips")
                        .queryParam("category", category)
                        .build())
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });
    }

    public record TipResponse(
            String icon,
            String title,
            String tip,
            String category
    ) {
    }
}
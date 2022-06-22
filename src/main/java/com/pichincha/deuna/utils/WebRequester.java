package com.pichincha.deuna.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WebRequester {

    public static <T> ResponseEntity<T> get(String url, Class<T> type) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<T> response = restTemplate.getForEntity(url, type);
        return response;
    }
}

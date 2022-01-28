package com.example.demo3;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class HttpServiceImpl implements HttpService {

    private final String server = "www.elasticsearch.com";
    private RestTemplate rest;
    private HttpHeaders headers;
    private HttpStatus status;

    @Override
    public String PostJson(Map<String, String> content) {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");

        JSONObject json = new JSONObject(content);

        HttpEntity<String> requestEntity = new HttpEntity<>(json.toString(), headers);
        ResponseEntity<String> responseEntity = rest.exchange(server, HttpMethod.POST, requestEntity, String.class);
        this.status = (responseEntity.getStatusCode());
        return responseEntity.getBody();
    }
}

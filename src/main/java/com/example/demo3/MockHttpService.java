package com.example.demo3;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MockHttpService implements HttpService {

    public String PostJson(Map<String, String> content) {
        return "Success!";
    }
}

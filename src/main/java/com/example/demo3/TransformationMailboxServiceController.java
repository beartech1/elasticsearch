package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Map;

@RestController
public class TransformationMailboxServiceController {

    private final HttpService mockHttpService;

    public TransformationMailboxServiceController(HttpService mockHttpService) {
        this.mockHttpService = mockHttpService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello Service!";
    }

    @PostMapping("/")
    public boolean insertData(@RequestBody Map<String, String> data) {
        data.forEach((key, value) -> System.out.println(key + ": " + value));


        return true;
    }
}

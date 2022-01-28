package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TransformationMailboxServiceController {

    private final HttpService httpService;

    public TransformationMailboxServiceController(HttpService httpService) {
        this.httpService = httpService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello Service!";
    }

    @PostMapping("/")
    public boolean insertData(@RequestBody Map<String, String> data) {
        data.forEach((key, value) -> System.out.println(key + ": " + value));

        String result = httpService.PostJson(data);

        return result != null;
    }
}

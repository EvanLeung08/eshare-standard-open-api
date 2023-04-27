package com.eshare.openapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Slf4j
@RestController
public class HealthCheckController {


    @GetMapping("/health")
    public ResponseEntity<Object> health() {
        HashMap<String, String> result = new HashMap<>(1);
        result.put("api name", "Open API");
        result.put("version", "v1");
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);

    }
}

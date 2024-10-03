package com.vitorfigueired0.dailytasks.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping()
    public ResponseEntity<String> defaultEndpoint() {
        return new ResponseEntity<String>("test", HttpStatusCode.valueOf(200));
    }
}

package com.pet.first.blood.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellnessController {

    @GetMapping(value = "/wellness", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getWellness() {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return ResponseEntity.ok().headers(httpHeaders).body("{\"Feeling\":\"Good\"}");
    }
}

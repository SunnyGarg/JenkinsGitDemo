package com.jenkins.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sunny Garg on 23/05/20
 */
@RestController
@RequestMapping(value = "/api/v2/")
public class APIController {

    @GetMapping(value = "test", produces = "application/json")
    public ResponseEntity<String> test(@RequestHeader HttpHeaders headers) {
        return new ResponseEntity<>("Message Processed Successfully.", HttpStatus.OK);
    }
}

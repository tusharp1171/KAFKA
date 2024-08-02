package com.exmple.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exmple.supplier.service.TestService;

@RestController
@RequestMapping("/api/kafka")
public class TestController {
	@Autowired
    private TestService testService;

  

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        boolean result = testService.test(message);
        if (result) {
            return ResponseEntity.ok("Message sent successfully");
        } else {
            return ResponseEntity.status(500).body("Failed to send message");
        }
    }
}
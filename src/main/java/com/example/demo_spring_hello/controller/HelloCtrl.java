package com.example.demo_spring_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_spring_hello.dto.HelloResponseDTO; 

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("")
public class HelloCtrl {

    @GetMapping("/hello")
    public HelloResponseDTO hello() {
        String koreaTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString();
        long timestamp = System.currentTimeMillis();
        String message = "Hello, World!";

        return new HelloResponseDTO(koreaTime, timestamp, message);
    }
}

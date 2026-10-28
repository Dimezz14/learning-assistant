package com.joshua.learningassistant.web;

import java.time.Instant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PingController {

    public record PingResponse(String status, Instant time) {}

    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("ok", Instant.now());
    }
}
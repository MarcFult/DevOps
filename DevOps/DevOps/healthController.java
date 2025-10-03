package com.devOps.DevOps;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthController {
    @GetMapping("/endpoint")
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("OK");
    }
}

package com.example.fastmanagementsystemv2.config;

import com.example.fastmanagementsystemv2.exception.AuthenticationFailedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
    @ExceptionHandler(value = AuthenticationFailedException.class)
    public ResponseEntity<String> authenticationFailedException(AuthenticationFailedException e) {
        return ResponseEntity.status(401).body(e.getMessage());
    }
}

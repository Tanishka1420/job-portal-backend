package com.tanishka.jobportal.exception;

import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public Map<String, String> handleResourceNotFound(
            ResourceNotFoundException ex) {

        return Map.of(
                "message",
                ex.getMessage()
        );
    }
}

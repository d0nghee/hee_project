package com.toyproject.deliveryking.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<?> applicationHandler(ApplicationException e) {
        return null;
    }
}

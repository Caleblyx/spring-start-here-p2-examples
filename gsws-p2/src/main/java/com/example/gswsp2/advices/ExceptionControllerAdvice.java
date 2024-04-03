package com.example.gswsp2.advices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.gswsp2.model.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage("Not enough money make the payment");

        return ResponseEntity.badRequest().body(errorDetails);
    }
}

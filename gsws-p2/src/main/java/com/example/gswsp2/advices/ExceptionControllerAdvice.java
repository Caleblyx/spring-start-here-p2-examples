package com.example.gswsp2.advices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.gswsp2.exceptions.NotEnoughMoneyException;
import com.example.gswsp2.model.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    
    @ExceptionHandler(NotEnoughMoneyException.class)
    public String exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage("Not enough money to make the payment");

        return "hello";
    }
}

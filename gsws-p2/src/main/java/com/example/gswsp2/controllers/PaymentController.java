package com.example.gswsp2.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.gswsp2.exceptions.NotEnoughMoneyException;
import com.example.gswsp2.model.ErrorDetails;
import com.example.gswsp2.model.PaymentDetails;
import com.example.gswsp2.services.PaymentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PaymentController {
    
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
    }
    

}

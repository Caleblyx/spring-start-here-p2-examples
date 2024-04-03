package com.example.gswsp2.services;

import org.springframework.stereotype.Service;

import com.example.gswsp2.exceptions.NotEnoughMoneyException;
import com.example.gswsp2.model.PaymentDetails;

@Service
public class PaymentService {
    
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}

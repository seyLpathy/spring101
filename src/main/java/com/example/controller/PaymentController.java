package com.example.controller;

import com.example.DTO.ErrorDetails;
import com.example.DTO.PaymentDetails;
import com.example.exceptions.NotEnoughMoneyException;
import com.example.services.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private PaymentService paymentService;
    private static Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails){
        logger.info("received payment is {}", paymentDetails.getAmount());
        return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        }
}

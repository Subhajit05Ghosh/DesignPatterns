package com.solidPrinciples.OCP.service;


import com.solidPrinciples.OCP.payment.Payment;

public class PaymentService {
    public void processPayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}

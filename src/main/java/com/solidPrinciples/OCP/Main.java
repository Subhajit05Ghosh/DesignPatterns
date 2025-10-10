package com.solidPrinciples.OCP;

import com.solidPrinciples.OCP.payment.CreditCardPayment;
import com.solidPrinciples.OCP.payment.Payment;
import com.solidPrinciples.OCP.payment.PaypalPayment;
import com.solidPrinciples.OCP.service.PaymentService;


public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PaypalPayment();
        paymentService.processPayment(creditCardPayment, 100.0);
        paymentService.processPayment(paypalPayment, 200.0);
        // Adding a new payment method does not require changes to existing code

    }
}

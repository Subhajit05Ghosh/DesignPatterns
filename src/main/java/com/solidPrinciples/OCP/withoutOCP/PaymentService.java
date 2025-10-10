package com.solidPrinciples.OCP.withoutOCP;

public class PaymentService {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CREDIT_CARD")) {
            // Process credit card payment
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equals("PAYPAL")) {
            // Process PayPal payment
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("Unsupported payment type: " + paymentType);
        }
    }
}

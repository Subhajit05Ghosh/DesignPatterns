package com.solidPrinciples.OCP.withoutOCP;

public class MainWithoutOcp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CREDIT_CARD", 100.0);
        paymentService.processPayment("PAYPAL", 200.0);
        paymentService.processPayment("BITCOIN", 300.0); // Unsupported payment type
    }
}

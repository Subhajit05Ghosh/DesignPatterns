package com.Patterns.Adapter;

class OldPaymentService {
    void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using Old Payment Service");
    }
}
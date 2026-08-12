package com.Patterns.Adapter;

public class Main {
    public static void main(String[] args) {

        OldPaymentService oldService = new OldPaymentService();

        Payment payment = new PaymentAdapter(oldService);

        payment.pay(1000);
    }
}

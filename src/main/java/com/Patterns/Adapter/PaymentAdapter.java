package com.Patterns.Adapter;

class PaymentAdapter implements Payment {

    private OldPaymentService oldService;

    PaymentAdapter(OldPaymentService oldService) {
        this.oldService = oldService;
    }

    public void pay(double amount) {
        oldService.makePayment(amount);
    }
}
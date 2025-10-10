package com.solidPrinciples.OCP.payment;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

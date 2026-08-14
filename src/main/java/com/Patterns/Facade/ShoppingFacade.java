package com.Patterns.Facade;

class ShoppingFacade {

    Product product = new Product();
    Payment payment = new Payment();
    Delivery delivery = new Delivery();

    void buyProduct() {
        product.checkProduct();
        payment.pay();
        delivery.ship();
    }
}

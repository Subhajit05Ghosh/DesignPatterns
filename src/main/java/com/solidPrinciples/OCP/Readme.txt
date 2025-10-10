Definition (OCP – Open/Closed Principle)

"Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification."

## You shouldn't modify existing class to add new behaviour.
## Instead, you should be able to extend it(via inheritance,interface,polymorphism).

Open for extension: You should be able to add new behavior or features to a class/module without changing its existing source code.

Closed for modification: Once a class is tested and deployed, you should not need to modify it when adding new functionality.

### Example of OCP Violation
Everytime you add a new PaymentMethod, you have to modify the PaymentService class.
This is a violation of OCP because the PaymentService class is not closed for modification.

```java
class PaymentService {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            // Process credit card payment
        } else if (paymentMethod.equals("PayPal")) {
            // Process PayPal payment
        } else if (paymentMethod.equals("Bitcoin")) {
            // Process Bitcoin payment
        }
        // More payment methods...
    }
}
```
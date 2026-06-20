package RunTimePolymophism;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
   public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " (Applying 2% fee)");
    }
}
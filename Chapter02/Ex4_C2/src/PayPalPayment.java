public class PayPalPayment implements PaymentStrategy {

    public PayPalPayment (String email) { }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal: " + amount);
    }
}

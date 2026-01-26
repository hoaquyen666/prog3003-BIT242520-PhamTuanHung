public class CreditCardPayment implements PaymentStrategy {

    public CreditCardPayment(String numbercard){ }

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard:" + amount);
    }
}

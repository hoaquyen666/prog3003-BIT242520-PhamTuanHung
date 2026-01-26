public class ShoppingCart {

    private PaymentStrategy pm;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        pm = paymentStrategy;
    }

    public void checkout(int amount)
    {
        if (pm == null) {
            throw new IllegalStateException("null");
        }
        pm.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9999"));
        cart.checkout(500);

        cart.setPaymentStrategy(new PayPalPayment("123@gmail.com"));
        cart.checkout(300);
    }
}
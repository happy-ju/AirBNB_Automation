package payment;

public class Payment {

    public void processPayment(String type, double amount) {
        System.out.println("Processing " + type + " payment of $" + amount);
    }
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processPayment("Credit Card", 150.75);
        payment.processPayment("PayPal", 50.00);
    }

}

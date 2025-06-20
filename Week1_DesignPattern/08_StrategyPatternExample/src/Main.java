class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Payed " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Payed " + amount + " using Pay Pal");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext();
        payment.setStrategy(new CreditCardPayment());
        payment.makePayment(200);

        payment.setStrategy(new PayPalPayment());
        payment.makePayment(500);
    }
}
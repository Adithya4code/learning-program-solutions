class CardPayment {
    public void pay(double amount) {
        System.out.println("Payment made using CARD: " + amount);
    }
}

class CashPayment {
    public void pay(double amount) {
        System.out.println("Payment made using CASH: " + amount);
    }
}

class UpiPayment {
    public void pay(double amount) {
        System.out.println("Payment made using UPI: " + amount);
    }
}

class CardPaymentAdapter implements PaymentProcess {
    private final CardPayment cardPayment = new CardPayment();

    public void processPayment(double amount) {
        cardPayment.pay(amount);
    }
}

class CashPaymentAdapter implements PaymentProcess {
    private final CashPayment cashPayment = new CashPayment();

    public void processPayment(double amount) {
        cashPayment.pay(amount);
    }
}

class UpiPaymentAdapter implements PaymentProcess {
    private final UpiPayment upiPayment = new UpiPayment();

    public void processPayment(double amount) {
        upiPayment.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcess card = new CardPaymentAdapter();
        PaymentProcess cash = new CashPaymentAdapter();
        PaymentProcess upi = new UpiPaymentAdapter();

        card.processPayment(1000.0);
        cash.processPayment(500.0);
        upi.processPayment(750.0);
    }
}
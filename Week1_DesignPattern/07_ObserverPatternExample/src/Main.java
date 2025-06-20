public class Main {
    public static void main(String[] args) {
        StockMarket Zomato = new StockMarket("ETERNAL", 2800.00);

        Observer mobileUser = new MobileApp("Adithya");
        Observer webUser = new WebApp("Chandana");

        Zomato.registerObserver(mobileUser);
        Zomato.registerObserver(webUser);

        Zomato.setStockPrice(2820.75);
        Zomato.setStockPrice(2850.50);

        Zomato.deregisterObserver(mobileUser);
        Zomato.setStockPrice(2900.00);
    }
}
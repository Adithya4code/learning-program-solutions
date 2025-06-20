import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private List<Observer> observers;
    private String stockSymbol;
    private double stockPrice;

    public StockMarket(String stockSymbol, double stockPrice) {
        this.observers = new ArrayList<>();
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer registered: " + observer);
    }

    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    // Method to simulate stock price change
    public void setStockPrice(double newPrice) {
        System.out.println("\nStock price updated: " + stockSymbol + " = $" + newPrice);
        this.stockPrice = newPrice;
        notifyObserver();
    }
}

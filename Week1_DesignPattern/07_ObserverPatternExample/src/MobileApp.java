public class MobileApp implements Observer{
    private String name;


    public MobileApp(String name) {
        this.name = name;
    }

    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name + " (Mobile App) - Stock Update: " + stockSymbol + " = $" + stockPrice);
    }
}

public class WebApp implements Observer{
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name + " (Web App) - Stock Update: " + stockSymbol + " = $" + stockPrice);
    }
}

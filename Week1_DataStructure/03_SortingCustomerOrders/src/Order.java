public class Order implements Comparable<Order> {
    private int orderID;
    private String customerName;
    private double totalPrice;

    public Order(int orderID, String customerName, double totalPrice) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public int compareTo(Order other) {
        return Double.compare(this.getTotalPrice(), other.getTotalPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        Order[] ordersForBubble = {
                new Order(1, "Alice", 250.0),
                new Order(2, "Bob", 100.0),
                new Order(3, "Charlie", 150.0)
        };

        Order[] ordersForQuick = ordersForBubble.clone();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(ordersForBubble);

        System.out.println("Sorted using Bubble Sort:");
        for (Order order : ordersForBubble) {
            System.out.println(order.getCustomerName() + " - " + order.getTotalPrice());
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(ordersForQuick);

        System.out.println("\nSorted using QuickSort:");
        for (Order order : ordersForQuick) {
            System.out.println(order.getCustomerName() + " - " + order.getTotalPrice());
        }
    }
}

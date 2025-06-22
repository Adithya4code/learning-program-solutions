public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Coffee Maker", "Home"),
                new Product(104, "Smartphone", "Electronics")
        };

        // Linear Search
        int index1 = LinearSearch.search(products, 103);
        System.out.println("Linear Search Found at: " + index1 + " -> " + products[index1]);

        // Binary Search
        int index2 = BinarySearch.search(products, 103);
        System.out.println("Binary Search Found at: " + index2 + " -> " + products[index2]);
    }
}

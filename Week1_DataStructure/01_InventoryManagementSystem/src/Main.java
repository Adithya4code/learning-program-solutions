public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("AB101", "Laptop", 2999, 5);
        Product p2 = new Product("AB102", "Mobile", 999, 20);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayAllProducts();

        inventory.update("AB101", "PC", 10999, 2);

        inventory.delete("AB102");

        System.out.println("------------------------");
        inventory.displayAllProducts();
    }
}

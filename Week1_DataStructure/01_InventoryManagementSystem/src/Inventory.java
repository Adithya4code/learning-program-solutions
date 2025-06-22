import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void update(String productId, String name, double price, int qty) {
        if(inventory.containsKey(productId)){
            Product product = inventory.get(productId);
            product.setProductName(name);
            product.setPrice(price);
            product.setQuantity(qty);
        } else {
            System.out.println("Invalid product");
        }
    }

    public void delete(String productId) {
        inventory.remove(productId);
    }

    public void displayAllProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p.getProductId());
        }
    }

}

import java.util.ArrayList;

public class inventory {
    private ArrayList<String> products;

    public inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty");
        } else {
            System.out.println("Current Inventory:");
            for (String product : products) {
                System.out.println(product);
            }
        }
    }

    public boolean isLowInventory() {
        // Define a threshold for low inventory, for example, 5 items
        int threshold = 5;
        return products.size() < threshold;
    }

    public static void main(String[] args) {
        inventory inventory = new inventory();

        // Adding products to inventory
        inventory.addProduct("book1");
        inventory.addProduct("book2");
        inventory.addProduct("book3");

        // Displaying current inventory
        inventory.displayProducts();

        // Removing a product from inventory
        inventory.removeProduct("book3");

        // Displaying updated inventory
        inventory.displayProducts();

        // Checking for low inventory
        if (inventory.isLowInventory()) {
            System.out.println("Low inventory alert!");
        } else {
            System.out.println("Inventory is sufficient.");
        }
    }
}

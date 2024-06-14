import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Item> items;
    private double totalPrice;

    public ShoppingCart() {
        items = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public void removeItem(Item item) {
        items.remove(item);
        totalPrice -= item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Item> getItems() {
        return items;
    }
}

public class shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Apple", 10);
        Item item2 = new Item("Banana", 50);
        Item item3 = new Item("Orange", 50);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        for(Item item : cart.getItems()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total Price: " + cart.getTotalPrice());

        cart.removeItem(item2);
        System.out.println("Removed item: " + item2.getName());
        System.out.println("Total Price after removing Banana: " + cart.getTotalPrice());
    }
}

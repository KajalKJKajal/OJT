public class Item {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Item item = new Item(1, "Pencil", 10, 25.99);
        item.displayDetails();
        item.updateQuantity(8);
        item.displayDetails();
    }
}

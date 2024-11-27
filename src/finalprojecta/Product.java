package finalprojecta;

public abstract class Product {
    private String name;
    private int quantity;

    // Constructor
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

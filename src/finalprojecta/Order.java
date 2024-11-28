package finalprojecta;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private String cropName;
    private int quantity;
    private LocalDate orderDate;
    private String status;

    public Order(int orderId, String cropName, int quantity, LocalDate orderDate, String status) {
        this.orderId = orderId;
        this.cropName = cropName;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCropName() {
        return cropName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


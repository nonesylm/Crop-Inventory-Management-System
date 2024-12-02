package finalprojecta;

import java.util.LinkedList;

public class Buyer {
    private String name;
    private String contactDetails;
    private LinkedList<Order> orderHistory;

    // Constructor
    public Buyer(String name, String contactDetails, LinkedList<Order> orderHistory) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.orderHistory = orderHistory;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public LinkedList<Order> getOrderHistory() {
        return orderHistory;
    }
}

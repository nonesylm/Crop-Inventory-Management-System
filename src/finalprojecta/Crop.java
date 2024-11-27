package finalprojecta;

import java.time.LocalDate;

public class Crop extends Product {
    private LocalDate expirationDate;
    private String status;

    // Constructor
    public Crop(String name, int quantity, LocalDate expirationDate, String status) {
        super(name, quantity);
        this.expirationDate = expirationDate;
        this.status = status;
    }

    // Getter methods
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getStatus() {
        return status;
    }
}

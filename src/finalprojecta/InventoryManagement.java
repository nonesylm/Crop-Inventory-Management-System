package finalprojecta;

import java.util.TreeMap;

public class InventoryManagement {
    private TreeMap<String, Crop> inventory;

    // Constructor
    public InventoryManagement() {
        inventory = new TreeMap<>();
    }

    // Methods to manage the inventory
    public void addCrop(Crop crop) {
        inventory.put(crop.getName(), crop);
    }

    public void removeCrop(String cropName) {
        inventory.remove(cropName);
    }

    public boolean checkAvailability(String cropName, int quantity) {
        Crop crop = inventory.get(cropName);
        return (crop != null && crop.getQuantity() >= quantity);
    }

    public void urgentCropNotification() {
        // Logic to notify about urgent crops
    }
}


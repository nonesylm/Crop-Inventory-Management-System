package finalprojecta;

public class BulkOrderProcessor extends OrderProcessor {
  private InventoryManagement inventorymanagement; 

  public BulkOrderProcessor(InventoryManagement inventorymanagement) {
    this.inventoryManagement = inventoryManagement; 
  }
  
    @Override
    public void processOrder(Order order) {
      System.out.println("Processing bulk order for + order.getCropName() + "..."); 
      
        if (inventoryManagement.isAvailable(order.getCropName(), order.getQuantity())) {
            inventoryManagement.deductStock(order.getCropName(), order.getQuantity());
            order.setStatus("Processed (Bulk)");

            System.out.println("Bulk order processed successfully for " + order.getCropName() +
                    ". Quantity: " + order.getQuantity());

      } else {
            order.setStatus("Failed (Insufficient Stock)");
            System.out.println("Bulk order failed for " + order.getCropName() +
                    ". Insufficient stock available.");
        }
    }
}

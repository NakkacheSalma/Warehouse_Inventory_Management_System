package inventory;

import java.util.ArrayList;

public class DailyShipment {
    public ArrayList<Integer> receivedProductIds = new ArrayList<>() ;


    public void recordReceivedProduct(Product product) {
        receivedProductIds.add(product.getId());
    }

    public void printReceivedProductIds() {
        System.out.println("Product IDs received in order:");
        for (Integer id : receivedProductIds) {
            System.out.println(id);
        }
    }
}

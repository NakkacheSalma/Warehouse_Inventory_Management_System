package inventory;

import java.util.*;

public class Warehouse {
    public HashMap<Integer, Product> products = new HashMap<>();

    public void displayInventory() {
        System.out.println("Inventory Display:  " + products.values().toString());

    }

    public void lookUpProduct(int productId){
        if(products.containsKey(productId)){
            System.out.println(products.get(productId).toString());
        }else{
           System.out.println("Product not found");
        }

    }

    public void addProduct(Product product){
        if(products.containsKey(product.getId())){
            System.out.println("Product ID must be unique.");
        }
        else{
            products.put(product.getId(), product);
        }
    }

    public void sortProduct(){
        ArrayList<Product> prods = new ArrayList(products.values());
        Collections.sort(prods, new SortbyName());
        System.out.println("Sorted Products: " + prods);
    }












}


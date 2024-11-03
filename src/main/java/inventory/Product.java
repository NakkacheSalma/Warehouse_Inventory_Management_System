package inventory;

import java.util.Comparator;

public class Product {
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return "Product{ ID: " + id + "--Name: " + name + "--Quantity: " + quantity+" }.";
    }


}

class SortbyName implements Comparator<Product> {

    public int compare(Product p111,Product p2){
        return p111.getName().compareTo(p2.getName());
    }
}


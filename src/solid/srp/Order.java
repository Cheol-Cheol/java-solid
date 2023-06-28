package solid.srp;

import solid.Item;

import java.util.List;

public class Order {
    private List<Item> itmes;
    private String status;

    public void addItem(Item item) {
        itmes.add(item);
    }

    public double totalPrice() {
        double total = 0;
        for (Item item : itmes) {
            total += item.getPrice();
        }
        return total;
    }
}

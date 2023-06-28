package solid.lsp.before;

import solid.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> itmes = new ArrayList<>();
    private String status;

    public void addItem(Item item) {
        itmes.add(item);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double totalPrice() {
        double total = 0;
        for (Item item : itmes) {
            total += item.getPrice();
        }
        return total;
    }
}

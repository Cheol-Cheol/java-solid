package solid;

public class Item {
    private int price;
    private String name;

    public Item(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

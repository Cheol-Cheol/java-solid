package solid.srp.after;

import solid.Item;

public class App {
    public static void main(String[] args) {
        Item item1 = new Item("do it java", 20000);
        Item item2 = new Item("spring", 18000);
        Item item3 = new Item("mySQL", 22000);

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        System.out.println("결제 금액은 " + order.totalPrice() + " 입니다.");

        PaymentProcessor processor = new PaymentProcessor();
        processor.payDebit(order, "0372846");
    }
}

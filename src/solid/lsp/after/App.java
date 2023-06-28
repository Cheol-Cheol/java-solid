package solid.lsp.after;

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

        PaymentProcessor processorDebit = new DebitProcessor("123456");
        processorDebit.pay(order);
        System.out.println("==========");

        PaymentProcessor processorCredit = new CreditProcessor("234567");
        processorCredit.pay(order);
        System.out.println("==========");

        PaymentProcessor processorBitcoin = new BitcoinProcessor("345678");
        processorBitcoin.pay(order);
        System.out.println("==========");

        PaymentProcessor processorPoint = new PointProcessor("456789");
        processorPoint.pay(order);
        System.out.println("==========");

        PaymentProcessor processorCash = new CashProcessor("567890");
        processorCash.pay(order);
        System.out.println("==========");

        PaymentProcessor processorKakao = new KakaopayPaymentProcessor("123@naver.com");
        processorKakao.pay(order);
    }
}

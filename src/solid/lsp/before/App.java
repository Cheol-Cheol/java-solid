package solid.lsp.before;

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

        PaymentProcessor processorDebit = new DebitProcessor();
        processorDebit.pay(order, "123456");
        System.out.println("==========");

        PaymentProcessor processorCredit = new CreditProcessor();
        processorCredit.pay(order, "234567");
        System.out.println("==========");

        PaymentProcessor processorBitcoin = new BitcoinProcessor();
        processorBitcoin.pay(order, "345678");
        System.out.println("==========");

        PaymentProcessor processorPoint = new PointProcessor();
        processorPoint.pay(order, "456789");
        System.out.println("==========");

        PaymentProcessor processorCash = new CashProcessor();
        processorCash.pay(order, "567890");

        PaymentProcessor processorKakao = new KakaopayPaymentProcessor();
        processorKakao.pay(order, "123@naver.com");
    }
}

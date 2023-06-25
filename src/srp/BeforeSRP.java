package srp;

import java.util.ArrayList;
import java.util.List;

class BeforeOrder {
    private List<String> items;
    private List<Integer> quantities;
    private List<Double> prices;
    private String status;

    public BeforeOrder() {
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.status = "open";
    }

    public void addItem(String name, int quantity, double price) {
        if (quantity <= 0 || price <= 0) {
            throw new IllegalArgumentException("양수만 입력하시오.");
        }
        this.items.add(name);
        this.quantities.add(quantity);
        this.prices.add(price);
    }

    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += quantities.get(i) * prices.get(i);
        }
        return total;
    }

    public void setStatus(String status) {
        if (!status.equals("open") && !status.equals("closed") && !status.equals("paid")) {
            throw new IllegalArgumentException("유효하지 않는 값입니다. 'open' 그리고 'closed' 그리고 'paid' 값만 유효합니다.");
        }
        this.status = status;
    }

    public void pay(String paymentType, String securityCode) {
        if (paymentType.equals("debit")) {
            System.out.println("직불카드 결제를 시작합니다.");
            System.out.println("비밀번호 확인: " + securityCode);
            System.out.println("결제가 완료되었습니다.");
            setStatus("paid");
        } else if (paymentType.equals("credit")) {
            System.out.println("신용카드 결제를 시작합니다.");
            System.out.println("비밀번호 확인: " + securityCode);
            System.out.println("결제가 완료되었습니다.");
            setStatus("paid");
        }
    }

}

public class BeforeSRP {
    public static void main(String[] args) {
        BeforeOrder order = new BeforeOrder();
        order.addItem("키보드", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB", 2, 5);
        System.out.println("결제 금액은 " + order.totalPrice() + " 입니다.");

        order.pay("debit", "0372846");
    }
}

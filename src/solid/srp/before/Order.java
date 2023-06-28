package solid.srp.before;

import solid.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> itmes = new ArrayList<>();
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

    public void pay(String paymentType, String securityCode){
        System.out.println(paymentType + " 결제를 시작합니다.");
        System.out.println("비밀번호 확인: "+ securityCode);
        System.out.println("결제가 완료되었습니다.");
        status = "paid";
    }
}

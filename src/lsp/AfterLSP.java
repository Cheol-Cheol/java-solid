package lsp;

import java.util.ArrayList;
import java.util.List;

class AfterOrder {
    private List<String> items;
    private List<Integer> quantities;
    private List<Double> prices;
    private String status;

    public AfterOrder() {
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
}

abstract class AfterPaymentProcessor {
    public abstract void pay(BeforeOrder order);
}

class AfterDebitPaymentProcessor extends AfterPaymentProcessor {
    private String securityCode;

    public AfterDebitPaymentProcessor(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(BeforeOrder order) {
        System.out.println("직불카드 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}

class AfterCreditPaymentProcessor extends AfterPaymentProcessor {
    private String securityCode;

    public AfterCreditPaymentProcessor(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(BeforeOrder order) {
        System.out.println("신용카드 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}

class AfterBitcoinPaymentProcessor extends AfterPaymentProcessor {
    private String securityCode;

    public AfterBitcoinPaymentProcessor(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(BeforeOrder order) {
        System.out.println("비트코인 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}

class AfterKakaopayPaymentProcessor extends AfterPaymentProcessor {
    private String email;

    public AfterKakaopayPaymentProcessor(String email) {
        this.email = email;
    }

    @Override
    public void pay(BeforeOrder order) {
        System.out.println("카카오페이 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + email);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}


public class AfterLSP {
    public static void main(String[] args) {
        BeforeOrder order = new BeforeOrder();
        order.addItem("키보드", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB", 2, 5);
        System.out.println("결제 금액은 " + order.totalPrice() + " 입니다.");

        AfterPaymentProcessor processorDebit = new AfterDebitPaymentProcessor("213232");
        processorDebit.pay(order);

        AfterPaymentProcessor processorCredit = new AfterCreditPaymentProcessor("232244");
        processorCredit.pay(order);

        AfterPaymentProcessor processorBitcoin = new AfterBitcoinPaymentProcessor("664464");
        processorBitcoin.pay(order);

        AfterPaymentProcessor processorKakaopay = new AfterKakaopayPaymentProcessor("dream1234@naver.com");
        processorKakaopay.pay(order);
    }

}

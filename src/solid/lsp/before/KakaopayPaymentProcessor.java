package solid.lsp.before;

public class KakaopayPaymentProcessor extends PaymentProcessor {
    @Override
    public void pay(Order order, String email) {
        System.out.println("직불카드 결제를 시작합니다.");
        System.out.println("이메일 확인: " + email);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}

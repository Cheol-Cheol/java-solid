package solid.srp.after;

public class PaymentProcessor {
    public void payDebit(Order order, String securityCode){
        System.out.println("직불카드 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
    public void payCredit(Order order, String securityCode){
        System.out.println("신용카드 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}

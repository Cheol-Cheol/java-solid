package solid.ocp.after;

public class PointProcessor extends PaymentProcessor{
    @Override
    public void pay(Order order, String securityCode) {
        System.out.println("포인트 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }
}
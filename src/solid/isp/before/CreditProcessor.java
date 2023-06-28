package solid.isp.before;

public class CreditProcessor extends PaymentProcessor {
    private String securityCode;

    public CreditProcessor(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(Order order) {
        System.out.println("신용카드 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }


    @Override
    public void authSms() {
        System.out.println("신용카드는 sms 인증이 불가능합니다.");
    }
}

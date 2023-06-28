package solid.isp.after.inheritance;

public class DebitProcessor extends PaymentProcesorSms {
    private String securityCode;

    public DebitProcessor(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(Order order) {
        System.out.println("직불카드 결제를 시작합니다.");
        System.out.println("비밀번호 확인: " + securityCode);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }


    @Override
    public void authSms() {
        System.out.println("sms인증이 완료되었습니다.");
    }
}

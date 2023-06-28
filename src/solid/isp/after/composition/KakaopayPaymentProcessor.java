package solid.isp.after.composition;

public class KakaopayPaymentProcessor extends PaymentProcessor {
    private String email;

    public KakaopayPaymentProcessor(String email) {
        this.email = email;
    }

    @Override
    public void pay(Order order) {
        System.out.println("직불카드 결제를 시작합니다.");
        System.out.println("이메일 확인: " + email);
        System.out.println("결제가 완료되었습니다.");
        order.setStatus("paid");
    }


    public void authSms(){
        PaymentProcessorSms AuthSms = new PaymentProcessorSms();
        AuthSms.authSms();
    }
}

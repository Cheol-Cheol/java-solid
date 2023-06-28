package solid.isp.before;

abstract class PaymentProcessor {
    public abstract void pay(Order order);
    public abstract void authSms();

}

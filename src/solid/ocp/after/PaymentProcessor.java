package solid.ocp.after;

abstract class PaymentProcessor {
    public abstract void pay(Order order, String securityCode);

}

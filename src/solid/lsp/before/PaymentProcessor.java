package solid.lsp.before;

abstract class PaymentProcessor {
    public abstract void pay(Order order, String securityCode);

}

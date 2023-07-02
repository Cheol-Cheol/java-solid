package solid.dip.before;

abstract class AtmInterface {
    public abstract void deposit(Object atm, String user, int money);
    public abstract void withdraw(Object atm, String user, int money);
}

package solid.dip.before;

public class App {
    public static void main(String[] args) {
        Atm atm = new Atm();
        WooriAtm wooriAtm = new WooriAtm();
        String user = "han";
        atm.deposit(wooriAtm, user, 10000);
        atm.withdraw(wooriAtm, user, 2000);

        KbAtm kbAtm = new KbAtm();
        atm.deposit(kbAtm, user, 20000);
        atm.withdraw(kbAtm, user, 50000);
    }
}

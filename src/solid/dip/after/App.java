package solid.dip.after;


public class App {
    public static void main(String[] args) {
        Atm atm = new KbAtm();
        String user = "han";

        atm.deposit(user, 10000);
        atm.withdraw(user, 2000);

        atm = new WooriAtm();

        atm.deposit(user, 20000);
        atm.withdraw(user, 50000);
    }
}


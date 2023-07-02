package solid.dip.before;

public class Atm extends AtmInterface{

    @Override
    public void deposit(Object atm, String user, int money){
        if(atm instanceof KbAtm){
            ((KbAtm) atm).deposit(user, money);
        }else if (atm instanceof WooriAtm){
            ((WooriAtm) atm).deposit(user, money);
        }
    }

    @Override
    public void withdraw(Object atm, String user, int money){
        if(atm instanceof KbAtm){
            ((KbAtm) atm).withdraw(user, money);
        }else if (atm instanceof WooriAtm){
            ((WooriAtm) atm).withdraw(user,money);
        }
    }

}

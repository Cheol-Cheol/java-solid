package solid.dip.before;

public class KbAtm {

    public void deposit(String user, int money) {
        System.out.println(user + "님 국민은행에 " + money + "원만큼 입금하셨습니다");
    }

    public void withdraw(String user, int money) {
        System.out.println(user + "님 국민은행에 " + money + "만큼 입출하셨습니다");
    }

}

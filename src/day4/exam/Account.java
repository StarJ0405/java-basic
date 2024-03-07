package day4.exam;

public class Account{
    int money;

    public void deposit(int money) {
        this.money += money;
        System.out.print(money+"원을 예금했습니다.");
    }
    public int withdraw(int money){
        this.money-=money;
        return money;
    }
    public int getRemainder() {
        return this.money;
    }
}
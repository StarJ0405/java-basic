package day4.exam;

import day4.exam.Account;

public class AccountExam {
//    public static void main(String[] args) {
//        Account a1 = new Account();
//
//        a1.deposit(1000); // 1000원을 예금했습니다.
//        a1.deposit(2000); // 2000원을 예금했습니다.
//        a1.deposit(3000); // 3000원을 예금했습니다.
//
//        int money = a1.withdraw(400);
//        System.out.println(money); // 400
//
//        int remainder = a1.getRemainder();
//        System.out.println(remainder); // 5600
//
//        money = a1.withdraw(1400);
//        System.out.println(money); // 1400
//
//        remainder = a1.getRemainder();
//        System.out.println(remainder); // 4200
//    }
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int remainder = a1.getRemainder();
        int money = a1.withdraw(400);
        System.out.println(money); // 400


        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}
package day6.exam;

import java.util.Scanner;

public class StringInputExam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        System.out.println("나이를 입력해주세요.");
        //1
        String name1 = scan.nextLine();
        int age1 = scan.nextInt();
        System.out.printf("안녕하세요. %d세 %s입니다.", age1, name1);
        System.out.println();
        scan.nextLine();

        System.out.println("이름을 입력해주세요.");
        System.out.println("나이를 입력해주세요.");
        String name2 = scan.nextLine();
        String age2 = scan.next();
        System.out.printf("안녕하세요. %s세 %s입니다.", age2, name2);

    }
}

package day6.exam;

import java.util.Scanner;

public class StringInputExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        System.out.println("나이를 입력해주세요.");
        //1
        String name = scan.nextLine();

        // String age = scan.nextLine();
        // int ageInt = Integer.parseInt(age);
        int ageInt = Integer.parseInt(scan.nextLine());
        System.out.printf("안녕하세요. %d세 %s입니다.\n", ageInt, name);
    }
}

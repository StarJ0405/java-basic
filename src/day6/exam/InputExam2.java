package day6.exam;

import java.util.Scanner;

public class InputExam2 {
    public static void main(String[] args) {
        // 구구단의 단을 입력받아 해당 단을 출력해주는 프로그램을 만드세요
        Scanner scan = new Scanner(System.in); // 표준 입력
        //첫번째 숫자를 입력해주세요: 12
        System.out.printf("첫번째 숫자를 입력해주세요:");
        int num1 = scan.nextInt();
        System.out.println();
        //두번째 숫자를 입력해주세요: 33
        System.out.printf("두번째 숫자를 입력해주세요:");
        System.out.println();
        int num2 = scan.nextInt();
        //12 + 33 = 45
        System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
    }
}

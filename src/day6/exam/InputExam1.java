package day6.exam;

import java.util.Scanner;

public class InputExam1 {
    public static void main(String[] args) {
        // 구구단의 단을 입력받아 해당 단을 출력해주는 프로그램을 만드세요
        Scanner scan = new Scanner(System.in); // 표준 입력
        System.out.print("단을 입력해주세요 : ");
        int dan = scan.nextInt();
        System.out.println();
        for (int i = 1; i <= 9; i++)
            System.out.println(dan + " * " + i + " = " + (dan * i));
    }
}

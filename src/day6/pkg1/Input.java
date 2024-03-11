package day6.pkg1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 출력 : 프로그램이 어떤 값을 콘솔창(표준 출력)에 출력
        System.out.println("표준 출력");
        // 입력 : 프로그램에 어떤 값을 콘솔창(표준 입력)에서 입력
        Scanner scan = new Scanner(System.in); // 표준 입력

        // 숫자 입력
        int num = scan.nextInt();
        System.out.printf("당신이 입력한 값은 : %d\n", num);
        // 문자열 입력
        String str = scan.next();
        System.out.printf("당신이 입력한 문자열은 %s\n", str);


    }
}

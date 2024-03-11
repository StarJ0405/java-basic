package day6;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 문자열 입력1 -> 단어 입력
        String str1 = scan.next(); // 단어 입력
        System.out.println(str1);
        // 문자열 입력2 -> 문장 입력
        String str2 = scan.nextLine(); // 단어 입력
        System.out.println(str2);

    }
}

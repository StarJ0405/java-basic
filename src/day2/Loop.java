package day2;

public class Loop {
    public static void main(String[] args) {
        // 반복문을 이용해 동일한 명령을 여러번 실행

//        while(true)
//            System.out.println("실행");

        // 원하는 만큼 반복
        int cnt = 0; // 반복 횟수 세는 용도

        while (cnt < 5) {
            System.out.println("실행");
            cnt++;
        }
        // for 문
        for (int cnt2 = 0; cnt2 < 5; cnt2++) {
            System.out.println("실행");
        }

        // 1부터 10까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // 1부터 10까지 짝수 출력
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        // 1부터 10까지 짝수 출력 - v2
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i); // 짝수일 때만 실행
        }

        // 1부터 10까지의 4의 배수 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0)
                System.out.println(i); // 짝수일 때만 실행
        }
    }
}

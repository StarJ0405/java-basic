package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            for (int j = 1; j <= 5; j++)
                System.out.println(j);

        // 구구단 2 ~ 9단 출력

        // 2단
        int dan = 2;
        for (int i = 1; i <= 9; i++)
            System.out.println(dan + " X " + i + " = " + (dan * i));

        // 3단
        dan = 4;
        for (int i = 1; i <= 9; i++)
            System.out.println(dan + " X " + i + " = " + (dan * i));

        // 2단을 8번 만들어보겠다.
        dan = 2;
        for (int j = 0; j < 8; j++) {
            for (int i = 1; i <= 9; i++)
                System.out.println(dan + " X " + i + " = " + (dan * i));
            dan++;
        }
    }
}

package day2.exam;

public class DoubleLoopExam5 {
    public static void main(String[] args) {
        int y = 3;
        // 출력
        for (int i = 1; i <= y; i++) {
            for (int j = i; j < y; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("*");
            for (int j = i; j < y; j++)
                System.out.print(" ");
            System.out.println();
        }
        y = 5;
        // 출력
        for (int i = 1; i <= y; i++) {
            for (int j = i; j < y; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("*");
            for (int j = i; j < y; j++)
                System.out.print(" ");
            System.out.println();
        }
        y = 7;
        // 출력
        for (int i = 1; i <= y; i++) {
            for (int j = i; j < y; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("*");
            for (int j = i; j < y; j++)
                System.out.print(" ");
            System.out.println();
        }

    }
}

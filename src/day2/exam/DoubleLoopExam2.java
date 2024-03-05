package day2.exam;

public class DoubleLoopExam2 {
    public static void main(String[] args) {

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int i = n; i <= m; i++)
            if (i % 2 == 1)
                for (int j = 1; j <= limit; j++)
                    if (j % 2 == 0)
                        System.out.println(i + " * " + j + " = " + (i * j));
    }
}

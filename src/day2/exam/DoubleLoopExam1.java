package day2.exam;

public class DoubleLoopExam1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++)
                if (j % 2 == 0)
                    System.out.println(i + " * " + j + " = " + (i * j));
    }
}

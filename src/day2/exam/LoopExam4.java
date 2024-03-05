package day2.exam;

public class LoopExam4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        int min = a > b ? b : a;
        int max = a < b ? a : b;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        for (int i = min+1; i <max;i++)
            System.out.println(i);
    }
}

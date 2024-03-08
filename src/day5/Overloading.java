package day5;

public class Overloading {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();
        int result1 = a계산기.더하기(1, 2);
        int result2 = a계산기.더하기(1, 2, 3);
        System.out.println(result1);
    }

    static class 계산기 {
        public int 더하기(int num1, int num2) {
            return num1 + num2;
        }

        public int 더하기(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }

        public double 더하기(double num1, double num2) {
            return num1 + num2;
        }
    }
}

package day3.exam;


public class ReturnExam4 {
    public static void main(String[] args) {

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

    }


    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void printEven(int n) {
        // isEven 메서드를 이용.
        for (int i = 1; i <= n; i++) {
            if (isEven(i))
                System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
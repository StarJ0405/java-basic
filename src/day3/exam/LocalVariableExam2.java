package day3.exam;


public class LocalVariableExam2 {
    static int num = 10;

    public static void printValue(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
}
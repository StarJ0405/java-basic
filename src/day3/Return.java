package day3;

import javax.sound.midi.SysexMessage;

public class Return {
    public static void plus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    // 반지름 * 반지름 * 3.14
    public static double circleArea(int radius) {
        // System.out.println(radius * radius * 3.14d);
        return radius * radius * 3.14d; // 원의 넓이를 반환
    }

    public static void main(String[] args) {
        plus(10, 20);

        double area1 = circleArea(5);//반지름이 5인 원의 넓이
        double area2 = circleArea(10);//반지름이 10인 원의 넓이

        System.out.println("반지름이 5인 원의 넓이 : " + area1);
        System.out.println("반지름이 10인 원의 넓이 : " + area2);
        // 반지름이 5인 원의 넓이를 3으로 나눈 값
        System.out.println(area1 / 3d);
        // 반지름이 5인 원의 넓이의 2배
        System.out.println(area1 * 2d);
    }
}
package day3.exam;
// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.


public class LocalVariableExam4 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.speed = 220;
        car1.run();
        ;
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        Car car2 = new Car();
        car2.speed = 250;
        car2.run();
        // 출력 : 자동차가 최대속력 250km로 달립니다.
    }
}


class Car {
    int speed;
    String model;
    String color;
    public void run() {
        System.out.println("자동차가 최대속력 " + speed + "km로 달립니다");
    }
    public void runWithOutSpeed() {
        System.out.println("자동차가 달립니다.");
    }
    public void drive(){
        System.out.println(color+" "+model+"이/가 "+speed+"km로 달립니다.");
    }
}
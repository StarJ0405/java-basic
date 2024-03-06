package day3.exam;


public class LocalVariableExam3 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car car = new Car();
        for (int i = 0; i < 3; i++)
            car.runWithOutSpeed();
        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car car1 = new Car();
        car1.runWithOutSpeed();
        Car car2 = new Car();
        car2.runWithOutSpeed();
        Car car3 = new Car();
        car3.runWithOutSpeed();
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}
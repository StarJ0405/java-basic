package day2;

public class IncDecOperator {
    public static void main(String[] args) {
        // 증감연산자
        int num =10;
        System.out.println(num + 5); // 출력 10, num의 값 10
        System.out.println(num ); // num의 값 10

        // 변수의 값을 5증가시키고 싶다.
        // num = 15; // 증가 x
        num = num +5;
        // num += 5; // 위와 동일 표현
        // 변수의 값을 3 감소시키고 싶다.
        num = num -3;

        num += 1; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num++;//위와 같은 표현
        num -=1; // 감소값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num--;
        System.out.println(num); // 12
    }
}

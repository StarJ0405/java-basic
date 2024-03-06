package day3;

public class Method {
    // 함수(메서드) 만들기(정의)
    public static void test() {
        System.out.println("테스트1");
        System.out.println("테스트2");
        System.out.println("테스트3");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        Person p2 = new Person();
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        System.out.println("안녕하세요 저는 " + p1.home + "에 사는 " + p1.age + "살 " + p1.name + "입니다.");
        System.out.println("안녕하세요 저는 " + p2.home + "에 사는 " + p2.age + "살 " + p2.name + "입니다.");

        // 메서드(함수)를 이용해 코드를 재활용한다.
        //함수도 만들어서 사용

        // 함수는 함수 안에 만들 수 없음
        // 함수는 클래스 밖에 만들 수 없음.
        test();

        test();

        test();

        // 함수를 사용하면 코드 재사용이 가능하기 떄문에 코드량이 줄어듬
        // 실질적인 코드는 하나이기 때문에 수정이 용이
    }
}
// 같은 폴더(패키지) 안에 동일한 이름의 클래스를 만들 수 없다.
//class Person {
//
//}
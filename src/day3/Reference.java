package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 메모리에 생성
        Person p2 = new Person();

        System.out.println(p1);
        ;
        System.out.println(p2);
        ;

        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        // 사람 복사
        Person p3 = p1;// 홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍길동이 2명이 된걸까? X
        p3.name = "이순신";
        System.out.println(p3.name);
        System.out.println(p1.name);

        // 홍길동을 2명 만들어주세요
        Person p4 = new Person();
        p4.name = "손흥민";
        p4.age = 30;
        p4.home = "런던";

        Person p5 = new Person();
        p5.name = p4.name;
        p5.age = p4.age;
        p5.home = p4.home;

        System.out.println(p4.name);
        System.out.println(p5.name);

        p4.name = "손흥만";
        System.out.println(p4.name);
        System.out.println(p5.name);

        // 객체의 복사
        // 참조값의 복사 -> 얕은 복사
        // 객체값의 복사 -> 깊은 복사

    }
}

class Person {
    String name;
    int age;
    String home;
    static int averageAge = 30; // 인류 평균 나이 30 가정

    // static이 붙은 것은 static이 붙지 않은 것을 사용할 수 없음
    // 객체의 변수와 함수에는 특별한 이유가 없으면 static을 붙이지 않는다.
    public void introduce() {
        // int age = 20; // 지역 변수
        System.out.println("안녕하세요 저는 " + age + "살 " + name + "입니다.");
        System.out.println("인류의 평균 나이는 " + averageAge + "살 입니다.");
    }

    public void addAge() {
        // int age = 20; // 지역 변수
        age++;
    }

}

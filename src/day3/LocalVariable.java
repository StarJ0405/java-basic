package day3;

public class LocalVariable {
    public static int test() {
        int num = 10;
        return num;
    }

    public static void main(String[] args) {
        int num = test();
        System.out.println(num);
        Person person = new Person();
        person.age = 20;
        person.introduce(); // 안녕하세요 저는 20살 입니다.
        person.addAge(); // 나이 1 증가
        person.introduce(); // 안녕하세요 저는 21살 입니다.

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";
        p1.home = "서울";

        p1.introduce();
        ;
        p1.addAge();
        p1.introduce();
        ;

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";
        p2.home = "부산";

        p2.introduce();
        p2.addAge();
        p2.introduce();
    }

}

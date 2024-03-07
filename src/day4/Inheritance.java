package day4;

public class Inheritance {
    // 매서드 오버라이드(재정의) ==> 부모한테 물려 받은 매서드와 동일한 이름의 매서드를 자식이 다시 정의하는
    // 자식에게 가까운 메서드를 우선적으로 사용.
    public static void main(String[] args) {
        // 프로그래밍 -> 중복과의 싸움
        // 데이터의 중복 -> 변수
        // 코드의 중복 -> 함수
        // 변수/함수의 중복 -> 클래스, 객체
        // 객체의 중복 -> 상속
        Dog d1 = new Dog();
        d1.bark();
        d1.breath();

        Cat c1 = new Cat();
        c1.meow();
        c1.breath();
    }
}

class Animal {
    public void eat() {
        System.out.println("먹는다");
    }

    public void breath() {
        System.out.println("숨을 쉰다~~!!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("야옹");
    }
}
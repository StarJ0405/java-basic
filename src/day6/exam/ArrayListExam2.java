package day6.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam2 {
    public static void main(String[] args) {
        List<사람> list = new ArrayList<사람>();

        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        list.add(사람1);
        list.add(사람2);
        list.add(사람3);
        list.add(사람4);
        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기
        // 3. 30대인 사람에게만 자기소개 시키기
        for (int i = 0; i < list.size(); i++) {
            사람 사람 = list.get(i);
            사람.introduce();
            if (사람.getAge() >= 30 && 사람.getAge() < 40)
                사람.introduce();
        }
    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
package day6.pkg1;

import day6.pkg2.Test;

public class AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자 => 인스턴스와 메서드, 클래스에 사용
        // public, protected, default, private

        Test t1 = new Test();
        t1.a = 10;
        System.out.println(t1.a);
        Test2 t2 = new Test2();
        t2.setAge(20);
        System.out.println(t2.getAge());
    }
}

class Test2 {
    private int id;
    private int age;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
            System.out.println("나이가 음수가 될수는 없다.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

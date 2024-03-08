package day5;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human(20, "홍길동", "서울");
        // 객체의 데이터 세팅 -> 객체 초기화
        //human1.age = 20;
        //human1.name = "홍길동";
        //human1.home = "서울";
        //human1.initial(20, "홍길동", "서울");
        human1.introduce();

        Human human2 = new Human(30, "이순신", "부산");
        //human2.age = 30;
        //human2.name = "이순신";
        //human2.home = "부산";
        // human2.initial(30, "이순신", "부산");
        human2.introduce();
    }

    static class Human {
        int age;
        String name;
        String home;

        public Human(int age, String name, String home) {
            this.age = age;
            this.name = name;
            this.home = home;
        }

//    public void initial(int age, String name, String home) {
//        this.age = age;
//        this.name = name;
//        this.home = home;
//    }

        public void introduce() {
            System.out.println("안녕하세요  저는 " + age + "살 " + name + "입니다.");
        }
    }
}


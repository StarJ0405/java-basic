package day6.exam;

public class AccessModifierExam2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작
        // 구현끝
        p1.setId(10);
        // 출력 : 제 번호는 20 입니다.
        System.out.println("제 번호는 " + p1.getId() + " 입니다.");
    }
}

class Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.


}
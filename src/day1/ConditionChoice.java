package day1;

public class ConditionChoice {
    public static void main(String[] args) {
        int age = 15;

        if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 17) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");

        } else { // == else if (age > 19)
            System.out.println("성인");
        }
    }
}

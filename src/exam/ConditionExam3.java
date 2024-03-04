package exam;

public class ConditionExam3 {
    public static void main(String[] args) {
        int age = 21; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 1번 방식
        // 구현시작
        boolean discount = false;
        if (age <= 19 || age >= 60)
            discount = true;
        // 구현 끝

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
        System.out.println(discount ? "할인 대상입니다." : "할인 대상이 아닙니다.");

        // 2번 방식
        // 구현시작
        String msg = "";
        if (age <= 19 || age >= 60)
            msg = "할인 대상입니다.";
        else
            msg = "할인 대상이 아닙니다.";
        // 구현 끝

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
        System.out.println(msg);

    }
}

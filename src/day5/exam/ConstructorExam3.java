package day5.exam;

public class ConstructorExam3 {
    // 출력 : 아래와 같이 출력되게 해주세요.
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }

    static class 사람 {
        팔 a왼팔;

        public 사람() {
            this.a왼팔 = new 팔();
        }

        void 걷다() {
            System.out.println("사람 걷는다.");
        }
    }

    static class 팔 {
        int 길이;

        public 팔() {
            this.길이 = 100;
        }

    }
}
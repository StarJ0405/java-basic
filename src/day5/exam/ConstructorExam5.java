package day5.exam;

public class ConstructorExam5 {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
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
        public 손 a손;

        public 팔() {
            this.길이 = 100;
            this.a손 = new 손();
        }

    }

    static class 손 {
        손가락 a엄지손가락;

        public 손() {
            this.a엄지손가락 = new 손가락(5);
        }
    }

    static class 손가락 {
        int 길이;

        public 손가락(int 길이) {
            this.길이 = 길이;
        }
    }

}

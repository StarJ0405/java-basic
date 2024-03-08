package day5.exam;

public class DuckSimulaction {
    // 오리 시뮬레이션을 구성을 이용해 중복없이 아래와 같이 출력되게 해주세요.
    // 힌트 : 오리에게 날개와 발을 부여하고 날때는 날개를 헤엄칠 때는 발을 사용하게 해보세요.

    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        // 출력 : 저는 날 수 없어요..
        // 출력 : 오리가 둥둥 떠다닙니다.

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 둥둥 떠다닙니다.


    }


    static class 오리 {
        boolean flight;
        boolean foot;

        public 오리(boolean canfly, boolean foot) {
            this.flight = canfly;
            this.foot = foot;
        }

        public void 날다() {
            if (flight)
                System.out.println("오리가 날개로 날아갑니다.");
            else
                System.out.println("저는 날 수 없어요..");
        }

        public void 헤엄치다() {
            if (foot)
                System.out.println("오리가 오리발로 헤엄칩니다.");
            else
                System.out.println("오리가 둥둥 떠다닙니다.");
        }

    }

    static class 청둥오리 extends 오리 {
        public 청둥오리() {
            super(true, true);
        }
    }

    static class 흰오리 extends 오리 {
        public 흰오리() {
            super(true, true);
        }
    }

    static class 고무오리 extends 오리 {

        public 고무오리() {
            super(false, false);
        }

        public 고무오리(boolean canfly, boolean foot) {
            super(canfly, foot);
        }
    }

    static class 고무2오리 extends 고무오리 {
    }

    static class 아수라오리 extends 고무오리 {
        public 아수라오리() {
            super(true, false);
        }
    }
}
package day4.exam;

public class WarriorSimulation {
    public static void main(String[] args) {
        // 1번
        //         전사 a전사 = new 전사();
        //
        //         a전사.나이 = 20;
        //         a전사.a무기 = new 활();
        //         a전사.a무기 = new 칼();

        // 2번
        //        전사 a전사 = new 전사();
        //
        //        String 이름 = "홍길동";
        //        a전사.이름 = 이름;
        //        a전사.나이 = 20;
        //        a전사.자기소개();
        //        // 안녕하세요 저는 20살 홍길동입니다.
        //
        //        a전사.a무기 = new 활();
        //        a전사.공격();
        //        // 출력 : 홍길동이/가 활로 공격합니다.
        //
        //        a전사.a무기 = new 칼();
        //        a전사.공격();
        //        // 출력 : 홍길동이/가 칼로 공격합니다.
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 15의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.
        //3번
    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    public void 자기소개() {
        System.out.println("안녕하세요 저는 " + 나이 + "살 " + 이름 + "입니다.");
    }

    public void 공격() {
        a무기.공격(이름);
    }

    public void 스킬사용() {
        a무기.스킬사용(이름);
    }
}

class 무기 {
    protected int damage;

    public void 공격(String who) {

    }

    public void 스킬사용(String who) {

    }
}

class 활 extends 무기 {
    // int damage = 10;
    활() {
        damage = 10;
    }

    public void 공격(String who) {
        System.out.println(who + "이/가 활로 " + damage + "의 데미지를 입힙니다.");
    }

    public void 스킬사용(String who) {
        System.out.println(who + "이/가 불화살 스킬을 사용합니다. 1.5배(" + (int) (damage * 1.5d) + ")의 피해를 입힙니다.");
    }
}

class 칼 extends 무기 {
    // int damage = 15;
    칼() {
        damage = 15;
    }

    public void 공격(String who) {
        System.out.println(who + "이/가 칼로 " + damage + "의 데미지를 입힙니다.");
    }

    public void 스킬사용(String who) {
        System.out.println(who + "이/가 연속 베기 스킬을 사용합니다. 2배(" + damage * 2 + ")의 피해를 입힙니다.");
    }
}


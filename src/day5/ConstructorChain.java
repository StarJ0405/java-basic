package day5;

public class ConstructorChain {
    public static void main(String[] args) {
        동물 a동물 = new 동물();
        고양이 a고양이 = new 고양이();
    }

    static class 동물 {
        int 나이;

        public 동물(int 나이) {
            this.나이 = 나이;
        }

        public 동물() {
            System.out.println("동물이 생성되었습니다.");
        }
    }

    static class 고양이 extends 동물 {
        public 고양이() {
            super();
            System.out.println("고양이가 생성되었습니다.");
        }

        public 고양이(int 나이) {
            super(나이);
        }
    }

}


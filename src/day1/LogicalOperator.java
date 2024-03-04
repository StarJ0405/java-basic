package day1;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자

        // &&(AND)
        // 둘 다 true 일때만 true, 그 외에는 false
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // true
        System.out.println(false && false); // false
        // ||(OR)
        // 둘다 false 일때만 false, 그 외에는 true
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println(true || false || true || false); // true

        System.out.println((10 > 20 && 1 != 1 && 3 > 2)); // false
        // !(NOT)
    }
}

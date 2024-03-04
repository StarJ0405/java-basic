package day1;

public class Print {

    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(200);
        System.out.println("홍성재");
        System.out.println("홍길동");

        System.out.println("안녕하세요.");
        System.out.println("반갑습니다.");

        // \n은 줄바꿈
        System.out.println("안녕하세요\n반갑습니다.");

        // 문자 합치기(+)
        System.out.println("안녕하세요 홍성재입니다.");
        System.out.println("안녕하세요" + " 홍성재입니다.");
        System.out.println("안녕하세요" + " 홍성재입니다." + " 반갑습니다.");

        // 숫자 더하기
        System.out.println(100 + 200);
        System.out.println(2000 + 3000);

        System.out.println("100");
        System.out.println(100);

        // 숫자와 문자는 구분해서 사용
        System.out.println("100" + "200");
        System.out.println(100 + 200);

        // 문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        // +연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("123124 + 56563 = " + 123124 + 56563);
        System.out.println("123124 + 56563 = " + (123124 + 56563));
        System.out.println(123124 + 56563 + " = 123124 + 56563");

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        // 구구단 2단을 출력해주세요. 단, 출력은 한번만 사용.
        for (int i = 1; i <= 9; i++)
            System.out.println("구구단 2단 : 2 * " + i + " = " + (2 * i));

    }
}

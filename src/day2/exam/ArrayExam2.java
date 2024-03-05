package day2.exam;

public class ArrayExam2 {
    public static void main(String[] args) {
        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr = {1, 2, 3, 4, 5};
        for (int n : arr)
            for (int i = 0; i < 3; i++)
                System.out.println(n);
    }
}

package day2.exam;

public class LoopExam3 {
    public static void main(String[] args) {
        int time = 74;
        int score = 0;

        // 출력 : 4
        for (int i = time; i <= 90; i++)
            if((i-time)%5==0)
                score++;
        System.out.println(score);;
    }
}

package day1.exam;

public class ConditionExam4 {
    public static void main(String[] args) {
        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;
        //
        int carHeight = 170;
        //
        if (tunnel1 > carHeight && tunnel2 > carHeight && tunnel3 > carHeight)
            System.out.println("PASS");
        else
            System.out.println("CRASH");
    }
}

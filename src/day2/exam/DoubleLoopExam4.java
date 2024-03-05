package day2.exam;

public class DoubleLoopExam4 {
    public static void main(String[] args) {

        // 출력
    /*

    높이 : [3]

      *
     **
    ***

    */
        int height = 3;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height; j++)
                if (j >= height - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */
        height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height; j++)
                if (j >= height - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
        height = 7;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height; j++)
                if (j >= height - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}

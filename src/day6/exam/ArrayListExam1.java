package day6.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam1 {
    public static void main(String[] args) {

        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 6; i++)
            list.add(i);
        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
        System.out.println(list.size());

        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2
        System.out.println(list.get(2) + ", " + list.get(3));

        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0
        list.remove(1);
        list.remove(0);
        System.out.println(list.get(2) + ", " + list.get(3));

        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}


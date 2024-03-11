package day6.pkg1;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // 동적 배열 ->길이를 정하지 않고 유동적으로 변하게 함
        // 동적배열(ArrayList)은 객체만 저장 가능
        List<Integer> list = new ArrayList<Integer>();

        // 요소 추가
        list.add(10);
        list.add(20);
        list.add(30);

        // 값 가져오기
        int ret = list.get(11);
        System.out.println((ret));

        // 값 삭제하기
        list.remove(1);
        System.out.println((list.get(1)));
        System.out.println((list.get(2)));

        // ArrayList의 크기 확인
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < size; i++)
            System.out.println(list.get(i));
    }
}

package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {
    public static void main(String[] args) {


        //자바의 기본 배열 형태
        //한번 생성되면 크기변경 x
        //크기 변경 시 새로운 배열을 생성하여 원래 배열 요소를 복사
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers[5]);

        numbers = new  int[6];
        System.out.println(numbers[5]);


        // 동적 배열(Arraylist) 사용법
         //1. ArrayList 란
        //java의 동적 배열 구현체
        //크기 제한 없이 동적으로 요소를 추가하거나 삭제가 가능
        //Java Collection Framework 의 일부 'java.util.ArrayList' 에서 제공

        //2. ArrayList 의 장점
        // 자유로운 크기 조절 , 유연성, 다양한 메소드 제공


        //3. ArrayList 주의점
        //ArrayList의 경우 기본 데이터 타입(int, char)등 사용 x
        //참조형 데이터 타입만 가능
        //int >>Integer
        //char >> Character
        //boolean >> Boolean
        //참조형 데이터 타입의 경우 기본값이 모두 null
        Integer a = null;
        //int a = null      <<오류가난다

        //ArrayList 선언 및 생성
        //ArrayList<데이터타입> 변수명 = new ArrayList<>(초기용량);
        ArrayList<Integer> arrayList = new ArrayList<>();
        //초기 용량 미설정 시, 기본 값은 10
        System.out.println(arrayList);


        //ArrayList 데이터 추가
        //배열의 마지막 값을 추가
        //배열명.add(추가할데이터)
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);
        //ArrayList 데이터 변경
        //배열명.set(인덱스번호, 변경할 데이터)
        arrayList.set(1,50);
        System.out.println(arrayList);


        //ArrayList 삭제
        //배열명.remove(인덱스번호)
        arrayList.remove(2);
        System.out.println(arrayList);

        //ArrayList 크기 확인
        //배열명.size();
        System.out.println("배열 사이즈 :" + arrayList.size());

        //ArrayList 원하는 위치에 데이터 삽입
        //배열명.add(인덱스번호, 데이터);
        arrayList.add(1, 123);
        System.out.println(arrayList);

        //특정 요소 접근
        //배열명.get(인덱스번호)
        System.out.println(arrayList.get(1));





    }
}

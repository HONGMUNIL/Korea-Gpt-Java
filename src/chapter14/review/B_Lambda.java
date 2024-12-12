package chapter14.review;


/*람다 표현식
 *  : 자바 8에서 도입된 홤수형 프로그래밍 스타일의 표현식
 * >> 익명 클래스를 간결하게 표현
 *
 * 1. 람다 사용 방법
 * (매개변수) -> {실행할 코드}
 *
 * 2. 예시
 * 1) 매개변수, 반환값이 모두없는 람다
 *  () -> System.out.println("Hello,Lambda!");
 * 2) 매개변수가 하나인 람다
 * x -> x*x;
 *
 * 3)매개변수가 두개 이;상인 람다
 * (a, b ) -> a + b;
 *
 * 4)실행문이 두 줄 이상인 람다
 *  : 두 줄 이상인 경우 return 키워드를 사용해 값을 반환
 * (x, y ) -> {
 *   int result = x + y;
 *   System.out.println("ㅇㄴㅁㅇㅁㅇ"+result);
 *   return result;
 * }
 *
 * () -> {
 *   System.out.println("Hello,Lambda");
 *   return "Hello"
 * }
 *
 *
 *
 * */


import java.util.List;

public class B_Lambda {
    public static void main(String[] args) {
        //리스트 vs 배열
        //1. Array
        // : 여러 데이터를 하나의 Object(객체)로 관리하기 위한 자료 구조
        // : 0부터 시작하는 저장 순서를 가지며 해당 Index 번호를 통해 데이터를 접근
        // : 연속된 메모리 공간에 저장
        // - 배열은 정의와 동시에 길이를 지정해야하고 길이를 바꿀 수 없다

        //2. List
        // : 순서가 있는 element(요소)의 모임
        // : ArrayList, LinkedList 등이 존재
        // : Array의 Index 번호가 데이터의 식별자 역할
        //      vs List의 index 번호는 데이터의 저장 위치만 확인하는 의미
        // : 불연속적 메모리 공간을 차지
        // : Array와 달리 동적, 배열의 크기가 정해져있지 않음

        //===================
        //List.of() 메서드
        // : 읽기 전용(불변) 리스트를 생성하는 데 사용
        // - 수정 불가(추가, 수정, 변경) null값을 포함할 수 X
        List<String> immutable = List.of("사과", "바나나", "체리");



    }
}







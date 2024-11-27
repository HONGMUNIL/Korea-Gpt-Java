package chapter01;

public class A_variable {
    public static void main(String[] args) {
        //변수
        // : 데이터를 저장할 수 있는 메모리 '공간'
        //1. 변수 선언 : 메모리 공간 생성
        // : 데이터타입 변수명

        int num; //정수 담는 그릇
        char chr;
        boolean bool;


        //2, : 변수 초기화 : 그릇에 데이터 넣기
        //cf: 처음 데이터를 넣는 과정: 초기화
        // 데이터를 바꾸는 과정: (재할당)
        // : 변수명 = 데이터값;


        num = 10;
        chr = '가';
        bool = true;

        int number = 10;
        char character = '가';
        boolean boolValue = true;
        /*변수 규칙
        * 문자, 숫자, 기호 사용
        * 대소문자를 구분, 길이제한 x(Name과 name 은 다름)
        * 숫자로 시작 x
        * 기호는 _ 와 $ 만 사용 사능
        * 자바의 예약어 키워드는 변수명으로 사용 x
        * lowerCamelCase 사용 권장
        * 전체 대문자 사용 x (상수와의 구분)  */

        int num24 =24;

        num24 = 48;
        // char num24 = '가'; 변수는 재선언이 불가능
        int height = 167;

        height = 180; //키는 변할수있는 상수값

        /*상수
        * 프로그램 실행 동안 그 값이 변경되지 않는 변수
        * 선언과 동시에 반드시! 초기화가 이루어져야함
        * 1, 상수 선언 방법
        * final 키워드를 사용하여 선언
        * final 데이터타입 = 데이터값
        *
        * 2, 상수 명명 규칙
        * UPPER_SNAKE_CASE 사용
        * 모든 문자를 대문자 + 연결은 _ 사용*/

        final int RESIDENT_NUMBER = 1234567;
        final double PI = 3.141592;


    }
}

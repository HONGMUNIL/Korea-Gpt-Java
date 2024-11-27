package chapter01;

import java.util.Scanner;

public class D_Io {
    //class 내부의 실행을 담당하는 메인 메서드: main + 자동완성(ctrl + space)
    public static void main(String[] args) {
        //자바 기본 입출력 (Input, Output)
        //입력: 콘솔창을 통해 개발자로부ㅡ터 입력을 받는 것
        // 출력: 콘솔창으로 데이터를 출력하는것

        /*1. 출력
        * System.out,println(출력하고자하는 변수 또는 상수 또는 데이터값);
        * sout 단축키로 자동 완성
        *  */
        System.out.print("ㅎㅇㅎㅇ");
        //ln: line (주어진 값을 콘솔에 출력하고 줄을 바꿈
        System.out.println("ㅂㄱㅂㄱ");



        /*2. 입력
        * 자바 내장  Scanner 객체를 사용
        * 다양한 입력 소스로부터 데이터를 읽어올 수 있는 형태
        * System.in (콘솔 창에서 표준 입력 스트림을 사용
        * import java.util.Scanner;
        * */


        //1. 스캐너 생성
        //Scanner(스캐너타입) 변수명 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");

        /*2. 스캐너 실행
        스캐너명.next(); -- 입력된 내용을 문자열로 변환
        스캐너명.nextInt(); --
        스캐너명.nextLine();-- 엔터까지의 전체 라인을 문자열로 반환
        * */
        int z = sc.nextInt();
        System.out.println("키 입력 해주세요");
        int height = sc.nextInt();

        //버퍼에 남아있는 개행 문자를 처리

        System.out.println("이름을 입력 하세요");
        String name = sc.nextLine();

        System.out.println("입력 값 : " +z);
        System.out.println("입력 카 : " + height);
        System.out.println("입력 이름 : " + name);

        //개행 문자 + 버퍼
        //nextInt() 나 nextDouble()의 경우
        //> 버퍼에 개행 문자가 입력으로 처리되는 문제가 발생
        //처리방법 : nextLine()의 입력 메서드 호출로 데이터를 사용

        //스캐너 종료 방법

        sc.close();



    }
}

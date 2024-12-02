package chapter05;

// 사칙연산 클래스
//: 두개의 값을 매개변수로 전달 받아서 사칙연산을 수행

class MyMath {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("정수 0으로 나눌수 없습니다");
            //return b;

        } else {

        }
        return a / b;
    }

    /*return 문
    * : 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아감
    * >반환값 유무에 상관없이 반드시 존재*/

    void noReturn(){
        System.out.println("해당 메서드는 반환 값이 없습니다.");

        //return;
        //: 자바 컴파일러가 반환 타입을 읽고
        // 해당 메서드의 마지막에 자동으로 return; 을 추가
    }

    String yesReturn(){
        String name = "이승아" ;
        return name;
        //: 반환 타입이 void 가 아닌 경우 반드시 해당 타입의 값이  return 뒤에 작성!

    }

    int max(int a, int b){
        if (a > b) return a;
        else return b;
    }


    int min(int a, int b){
       return a < b ? a : b;
       //return a > b ? b : a;
    }
}



public class Method03  {
    public static void main(String[] args) {

        MyMath a= new MyMath();

        System.out.println(a.add(10,20));
        // 인자값과 매개변수의 관계
        // : 자바는 값에 의한 호출 방식을 사용
        //메서드 호출시 인자값이 "매개변수에 복사" 되어 전달
        //System.out.println(a.divide(10,0)); by zero
        //자바는 정수형에서 0으로 나누기를 시도하면 Exception가 발생
        //실수형 연산(0.0으로 나누기 등)에서는 오류가 나지 않는다
        a.divide(10,0);
        System.out.println(a.divide(10,5));

        //메서드의 호출: 객체명.메서드명(인자));
        System.out.println(a.max(11,12));
        System.out.println(a.min(11,12));













    }
}

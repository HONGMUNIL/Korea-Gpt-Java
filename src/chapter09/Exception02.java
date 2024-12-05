package chapter09;

//Throwable : 예외(Exception) + 오류(Error)

//사용자 정의 예외 클래스 == //
// : 자바의 Exception 클래스를 상속받는 자식  클래스

import java.util.InputMismatchException;
import java.util.Scanner;

// == throws 키워드 == //
// : 메서드 선언부에 위치
// : 호출자에게 예외 처리를 위임
// - 체크(컴파일) 예외: 필수 / 언체크(런타임) 예외: 선택
// - (접근데어자) 반환타입 메서드명() throws ExceptionType {}


class InvalidUserException extends Throwable {

}


class CustomException2 extends Exception {
    //생성자
    CustomException2(String message) {
        super(message);
    }

}

public class Exception02 {
    //1. 단일 예외 던지기
    //메서드 선언부에서 해당 메서드가 던질 수 있는 예외를 명시하는 키워드
    // : 호출자에게 예외 처리를 위임
    static void login(String username, String password) throws InvalidUserException {
        if (!"admin".equals(username)) {
            throw new InvalidUserException("사용자 이름이 잘못 되었습니다");
        }
    }

    //2. 여러 예외 던지기
    static void exception(int num) throws  ArithmeticException, ArrayIndexOutOfBoundsException {

    }

    public static void main(String[] args) {
        // == 사용자 정의 예외 사용 == //
        //throw new CustomException2("예외 처리되지 않는 예외!!");
        // : 사용자 정으 ㅣ예외를 발생시키는 throw 키워드의 경우
        // : 예외 처리 구문 내에 사용되지 않으면 (컴파일) 예외 발생!

        try {
            throw new CustomException2("사용자 정의 예외가 발생");
        } catch (CustomException2 e) {
            System.out.println(e.getMessage());
        }

        System.out.println("======================");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수를 입력 하세[요");
            int number = sc.nextInt();
            System.out.println("입력 하신 숫자는 " + number + " 입니다");


        } catch (InputMismatchException e) {
            //catch 블럭의 예외객체인 'e'
            // : 주로 객체변수는 Exception의 철자를 사용하여 'e'로 명시
            System.out.println("정수가 아닌 다른 타입의 입력이 작성됨.");
        } finally {
            {
                sc.close();
            }
            login("admin"."password");
            try {

            }catch (InvalidUserException e){
                System.out.println(e.getMessage());
            }

            System.out.println("==================");

            try{
                System.out.println("여러 예외 던지기 테스트");
                exception(1);
            }catch (ArithmeticException e){
                System.out.println("예외 처리1 : " + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외 처리2 : " + e.getMessage());
            }
            System.out.println("정상적인 코드");


        }


    }
}

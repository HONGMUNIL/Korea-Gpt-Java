package chapter08;


//인터페이스의 멤버 변수의 특성
// : 자동으로 public static final 특성
// >> 어디서든 접근 가능 + 인스턴스화 없이 인터페이스명으로 접근 가능 (모두 같은 값 공유)
// + 값 변경 불가능



//cf) 클래스의 멤버, 인터페이스 멤버
//>> 해당 구조 내부의 '구성요소'

//== 다중 인터페이스 구현 ===//

interface Example1{
    int EXAMPLE_VARIABLE = 10;

    void printVar1();
    default void method2(){
        System.out.println("예시 1");
    }
}
interface Example2{
    void printVar2();

    default void method2(){
        System.out.println("예시 2");
    }
}
//여러 개의 인터페이스를 구현하는 클래스 정의
// : implements 키워드 뒤에 여러 개의 인터페이스를 , 로 구분하여 나열
class ExamlpleClass implements Example1, Example2{
    public void printVar1(){
        System.out.println(EXAMPLE_VARIABLE);
    }
    public void printVar2(){
        System.out.println("다중 인터페이스 구현");
    }

    //cf) 다중인터페이스의 주의 사항
    // : 여러개의 인터페이스에서 같은 시그니처(선언부)를 가진 디폴트메서드가 존재할 경우
    //>> 반드시 오버라이드하고 명시적으로 구현
    @Override
    public void method2(){
        System.out.println("Method, 중복되는 디폴트메소드");
    }
}

public class Interface03 {
    public static void main(String[] args) {
        ExamlpleClass examlpleClass = new ExamlpleClass();
        examlpleClass.printVar1(); //10
        examlpleClass.printVar2(); //다중 인터페이스 구현
        examlpleClass.method2(); //Method, 중복되는 디폴트메소드

        //cf) 인터페이스의 다형성
        // : 인터페이스를 구현한 클래스의 객체는 해당 인터페이스의 타입으로 동작 가능
        // (해당 타입이 될수 있음)
        // - 해당 인터페이스 내의 구조만 가짐
        //+)재정의된 메서드는 유지!

        Example1 example1 = examlpleClass;
        example1.printVar1();
        //example1.printVar2(); -Error (Example1에 정의되지않는다)
        example1.method2(); //Method, 중복되는 디폴트메소드

    }
}

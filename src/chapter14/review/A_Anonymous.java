package chapter14.review;



/* 익명 ( 내부 , 중첩 ) 클래스  */
// : 클래스를 정의 하면서 동시에 인스턴스화가 이뤄지는 방법
// : 이름이 없기 떄문에 재사용 X 불가, 일회성 사용 객체 정의에 유용



//1. 인터페이스 구현 예시
interface Animal{
    void sound(); //추상 메서드 - 구현({}) 이 없는 메서드

    //cf ) 람다 표현식으로 변환 가능한 인터페이스는 '함수형 인터페이스'로
    //      단하나의 추상 메서드만을 가져야함
}

//인터페이스를 구현한 클래스 - 재사용 가능
class  Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}


//2. 추상 클래스
abstract class Vehicl {
    abstract void run();

}

//+) 추상 클래스 예시(반환타입 String)
abstract class Person{
    abstract String getName();
}


public class A_Anonymous {
    public static void main(String[] args) {
        Animal dog1 = new Animal() {
            //익명클래스 사용
            @Override
            public void sound() {
                System.out.println("멍멍");
            }
        };

        dog1.sound();



        Vehicl car = new Vehicl() {
            @Override
            void run() {
                System.out.println("자동차가 달립니다");
            }
        };


        //추상메서드 - 반환타입 String
        Person person = new Person() {
            @Override
            String getName() {
                return "박정아";
            }
        };
        System.out.println(person.getName());


    }
}











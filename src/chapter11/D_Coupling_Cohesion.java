package chapter11;


/* ===결합도 & 응집도 ====

cf) 모듈
: 소프트웨어를 각 기능별로 나눈 소스 단위(하나로 정의될수있는 클래스나 파일 같은것)
 +) 모듈화: 하나의 큰 소프트웨어를 분리시키는 과정
 >>좋은 소프트웨어 일수록 모듈의 독립성이 높다
 >>모듈의 독립성을 결합도(Coupling)와 응집도의 기준 단계로 측정


* 1. 결합도(Coupling) (낮은 결합도)
*  : 두 개의 클래스나 모듈이 얼마나 강하게 연결되어 있는지를 나타냄
*  : 모둘과 모듈 간의 의존 정도

// -낮은 결합도: 두 모듈이 서로 독립적으로 동작
// >> 프로그램 유지 보수하기 쉽게 만들고,
// >> 새로운 기능을 추가하거나 기존 코드를 수정할때 오류 발생 가능성을 낮춤

*
* 2. 응집도        (높은 응집도)
* : 하나의 클래스나 모듈 안에서 관련된 작업들끼리 얼마나 잘 모여있는지를 나타냄
* : 한 모듈 내의 구성요소들 간의 연관 정도

// -높은 응집도: 두모듈이 서로 얽혀있는 관계, 프로그램에 대한 이해, 유지보수를 용이 !!
//>> 하나의 클래스가 관련된 일들만 하고, 해당 일이 잘 명시

//- 낮은 응집도: 하나의 클래스가 너무 많은 일을 하거나, 관련 없는 일을 하는 것.



// ==결합도와 응집도의 관계===//
// 낮은 결합도 + 높은 응집도
// : 각 클래스나 모듈이 독립적으로 동작하면서도, 본인의 역할에 충실
// : 유지보수가 쉽고, 확장성이 좋다.
*/

// == 낮은 결합도와 높은 응집도 구현==//
// : 클래스 간의 의존성을 줄이고, 변경에 강한 구조를 작성

//1. 인터페이스와 다형성을 활용
//      :구현 클래스에 의존하지 않고, 인터페이스를 통해 서로 의존하게 구현(DIP)
//     >> 구현이 변경되거나 확장되어도 인터페이스에만 맞추면 동작

//인터페이스 정의
interface Payment{
    void processPayment();
}

//구현 클래스
class CreditCardPayment implements Payment{
    @Override
    public void processPayment(){
        System.out.println("신용카드로 결제합니다.");
    }
}



class OrderClass{
    // 2) 의존성 주입( Dependency Injection)
    // : 클래스가 직접 객체를 생성하지 않고, 외부에서 객체를 주입받고록 설계
    // - 객체 간으 ㅣ강한 결합을 줄이고, 변경에 유연


    private Payment payment;

    public OrderClass(Payment payment){
        this.payment = payment;
    }

    void  checkout(){
        payment.processPayment();
    }
}


public class D_Coupling_Cohesion {
    public static void main(String[] args) {
         Payment payment = new CreditCardPayment();
         OrderClass orderClass = new OrderClass(payment);
         orderClass.checkout();
    }

}

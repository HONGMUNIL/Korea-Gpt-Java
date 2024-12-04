package chapter08;


/*
 * ==인터페이스(Interface)==
 *  : 객체가 어떤 방식으로 동작해야 하는지 정의하는 추상 타입
 *  - 추상 메서드와 상수만 포함된 특수한 클래스
 *  - 모든 메서드는 추상 메서드로 구성
 *  - 상수는 public static final 특성을 가짐
 * >> 실제 구현은 인터페이스를 구현한 클래스에서 담당
 *
 *
 *  == 인터페이스 특징
 * 1) 메서드
 *   : 모든 메서드는 기본적으로 public abstract 로 선언
 *   >> 생략 가능
 * 2)변수(필드)
 *    : 모든 변수는 기본적으로 public static final 상수
 *   >> 생략 가능
 *
 * +) 다중 구현을 지원
 *   : 한 클래스에서 여러 인터페이스를 동시에 구현 가능
 * >> 객체의 행동을 정의하는 역할
 *
 *  == 추상클래스 vs 인터페이스 ==
 *
 * 1)추상클래스
 *  : 공통적인 기능을 제공하는 '부분적 구현'을 담당
 *  구성요소 : 추상메서드, 구체 메서드, 필드, 생성자
 *  - 단일 상속만 가능(extends)
 * >> 기본 구현을 제공하고 확장 가능
 *
 * 2)인터페이스
 *  : 클래스의 행동을 정의
 *  구성요소: 추상 메서드, 상수, 디폴트 메서드, 정적 메서드
 * - 다중 구현 가능해서(implements, 구현하다) 확장이 불가능
 * >> 객체가 해야할 동작(행위)를 정의 */


// == 인터페이스 구현 방법 ==
// interface 인터페이스명 { }

//인터페이스 예시
interface PlayingCard {
    //1. 멤버변수로 상수 선언
    // : public static final 특성을 가짐 (생략가능) : 변하지않는값이기때문에 선언과동시에 명시해야함
    int SPADE = 4;
    public static final int DIAMOND = 3;
    int HEART = 2;
    int CLOVER = 1;




    //2. 메서드
    // : public abstract 특성을 가짐 ( 생략 가능 )
    // >> 모든 메서드가 추상 메서드여야함
    // >> 해당 인터페이스 활용을 위해 모든 클래스에서 접근 가능(public)
    public abstract String getCardNumber();
    String getCardKind();




    //3. 디폴트 메서드
    // : 인터페이스에 새 기능을 추가하면서 기존 구현을 포함
    // : 기본 구현이 제공, 오버라이딩(재정의)가 가능
    //default void 메서드명() { 구현부 }
    default void defaultMethod() {
        System.out.println("디폴트 메서드입니다");
    }


    //cf)디폴트 메서드는 interface 내부에서 반드시 default 키워드 작성
    // : 생략 시 구현부가 존재할 수 없다는 오류 발생
    //   void neDefalut(){
    //   }

    //!!디폴트메서드 --재정의 가능,, 정적메서드 -- 재정의 불가능!!


    //4. 정적 메서드
    // : 인터페이스에서 직접 구현
    // >> 인터페이스 이름으로 직접 호출, 오버라이딩(재정의) 불가능 ( 객체 인스턴스 없이 사용 가능)
    // >> 인터페이스와 관련된 공통 동작(유틸리티) 메서드를 제공하기 위해 사용
    static void staticMethod(){
        System.out.println("정적 메서드입니다");
    }
}

// === 인터페이스 구현 ==== //
// : implements 키워드 사용
class  Card implements PlayingCard{
    private String cardNumber;
    private String cardKind;

    Card(String cardNumber, String cardKind){
        this.cardNumber = cardNumber;
        this.cardKind = cardKind;
    }

    //인터페이스 안의 추상 메서드를 구현한 클래스안의 메서드는 public 지정을 해야함(안하면 default로 지정되니까 해야함)
    public String getCardNumber(){
        return cardNumber;
    }

    public String getCardKind(){
        return cardKind;
    }

    //디폴트 메서드 재정의
    // : 인터페이스 내의 디폴트 메서드 재정의 시 public 설정
    @Override
    public void defaultMethod(){
        System.out.println("Card 클래스에서 재정의된 디폴트 메서드");
    }

    //cf) 인터페이스의 모든 메서드는 기본적으로 public 접근제한자를 가짐
    // 이유 : 인터페이스 자체가 어떤 동작을 외부에서 사용할 수 있음을 보장하기 떄문

}


public class interface01 {
    public static void main(String[] args) {
        //인터페이스의 추상 메서드 사용
        Card card = new Card("7", "HEART");

        System.out.println(card.getCardNumber());
        System.out.println(card.getCardKind());


        //재정의(오버라이딩)은 선택적

        card.defaultMethod(); // Card 클래스에서 재정의된 디폴트 메서드

        //card.staticMethod();  --Error
        PlayingCard.staticMethod();  // 정적 메서드입니다

        //인터페이스의 필드(상수) 사용
        System.out.println(PlayingCard.CLOVER);
        System.out.println(PlayingCard.HEART);
        System.out.println(PlayingCard.SPADE);
        System.out.println(PlayingCard.DIAMOND);

    }
}

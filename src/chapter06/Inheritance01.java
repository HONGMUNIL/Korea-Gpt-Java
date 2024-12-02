package chapter06;

/*상속(Inheritance)
 * :한 클래스의 속성과 메서드를 다른 클래스가 물려받는것
 * // - 기존의 클래스를 재사용하여 새로운 클래스를 작성하는것
 * // 코드의 재사용성과 중복을 제거(프로그램의 생산성 향상)
 *
 * 상속 구현 방법
 *  : extends 키워드를 사용하여 구현 (확장하다)*/

class Parent {
} //- 기존 클래스 (부모 클래스)


class Child extends Parent {
} // -새로운 클래스(자식 클래스)


//동물 클래스
class Animal {
    String name;

}

// Dog 자식 클래스 - Animal 부모 클래스의 상속을 받음
class Dog extends Animal {
    //부모 클래스의 속성과 메서드를 모두 상속 받는다
    //String name; << 이 변수가 생략되어있는것

    void bark() {
        System.out.println("강아지가 짖습니다");
    }
}

//==상속 예시==
class Tv {
    boolean power;
    int channel;

    void setPower() {
        power = !power;
    }

    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class SmartTv extends Tv{
    boolean ott; //ott 플랫폼 전원 상태(on/off)

    void displayOtt(String platform){
        if (ott) {

            System.out.println(platform);
        }else{
            System.out.println("OTT연결이 되지 않았습니다");
        }
    }
}


public class Inheritance01 {
    public static void main(String[] args) {
        Dog choco = new Dog();
        choco.name = "초코";
        System.out.println(choco.name);
        choco.bark();


        SmartTv smartTv = new SmartTv();
        smartTv.channel = 10;
        smartTv.channelUp();
        smartTv.channelUp();
        smartTv.channelUp();
        System.out.println(smartTv.channel);

        smartTv.displayOtt("Netflix");
        smartTv.ott = true;
        smartTv.displayOtt("Netflix");
    }
}

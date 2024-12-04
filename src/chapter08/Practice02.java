package chapter08;


// ===인터페이스 ===//
// Fruit 과일 인터페이스 정의
// - color :추상메서드
// - describe: 디폴트 메서드
// - printType: 정적 메서드


interface Fruit {
    String color();         //추상 메서드


    default void describe() {
        System.out.println(" 과일의 색상은 " + color() + "이며, 과일의 모양은 동그랗습니다");
    }

    static void printType() {
        System.out.println("과일(Fruit) 타입입니다.");
    }
}


class Apple implements Fruit {
    @Override
    public String color() {
        return "red";
    }

}

class Banana implements Fruit {
    @Override
    public String color() {
        return "Yellow";
    }

    @Override
    public void describe() {
        System.out.println(" 과일의 색상은 " + color() + "이며, 모양은 깁니다");

    }
}

class Orange implements Fruit {
    @Override
    public String color() {
        return "orange";
    }
}

//또다른 인터페이스
interface TropicalFruit extends Fruit {
    //extends
    // : 클래스 간에, 인터페이스 간에 가능

    //cf) implements
    // : 인터페이스를 클래스로 구현
    default void tropicalFeature() {
        //열대과일 특징
        System.out.println("열대과일은 후숙하면 더 맛있습니다");
    }
}

//cf) instanceof 연산자
// : A 객체가 B 클래스(종류)와 같은지 확인해줘
//>>결과값을 boolean으로 변환

class Mango implements TropicalFruit {
    public String color() {
        return "golden";
    }

    @Override
    public void describe() {
        System.out.println(" 과일의 색상은 " + color() + "이며, 모양은 타원형입니다");
    }
}


public class Practice02 {
    public static void main(String[] args) {
        //다형성 적용
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit banana = new Banana();
        TropicalFruit mango = new Mango();

        Fruit[] fruits = {apple, orange, banana, mango};

        for(Fruit fruit : fruits){
            fruit.describe();
            if(fruit instanceof TropicalFruit){
                TropicalFruit tropicalFruit = (TropicalFruit)  fruit; //다운캐스팅
                tropicalFruit.tropicalFeature(); //열대과일은 후숙하면 더 맛있습니다
            }
        }

        if (mango instanceof  Fruit){
            Fruit mangoAsFruit = (Fruit) mango;
            mangoAsFruit.describe();
        }

         if (banana instanceof  TropicalFruit){
            TropicalFruit bananaAsTropical = (TropicalFruit) banana;
            bananaAsTropical.tropicalFeature();
        }else{
             System.out.println("바나나는 열대 과일이 아닙니다");
         }

    }
}

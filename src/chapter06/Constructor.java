package chapter06;

/*클래스 구조
 * 필드, 메서드, 생성자
 *
 * ==생성자==
 * 객체(인스턴스)가 생성될 때 호출되는 '인스턴스 초기화 메서드'
 *
 * 생성자 조건
 * -생성자 이름은 클래스 이름과 동일
 * -리턴값이 없는 메서드 형식(void 타입 생략)
 *
 * '컴파일러가 제공하는 기본 생성자'
 * 클래스에 생성자가 없으면 컴파일러가 자동으로 생성해줌
 * 매개변수가 없고, 아무 작업도 하지 않은 생성자
 *
 * cf)인스턴스 생성
 * : 생성자가 인스턴스 생성 X
 * : new 연산자 키워드가 인스턴스를 생성 O
 * */


class Example1 {
    int value;
    //컴파일러가 제공하는 기본 생성자(매개변수X. 아무런 구현x)가 생략
}

class Example2 {
    int value;

    //사용자 정의 생성자
    //컴파일러가 자동으로 기본 생성자를 제거
    Example2(int value) {
        this.value = value;
    }

    //빈 생성자를 직접 명시해야만 사용 가능
    //사용자 정의생성자가 1개라도 있는경우
    Example2() {
    }


}
class Car {
        String color;
        String gearType; //자동(auto), 수동 (manual)
        int door;

        Car() {} //기본 생성자 - 차를 생성한 후 필드값 할당

        //사용자 정의 생성자
        Car(String color, String gearType, int door) {
            this.color = color;
            this.gearType = gearType;
            this.door = door;
        }
        Car(String color){
            //cf)정의 생성자에서 다른 생성자 호출시 :this()를 사용
            //: 생성자 이름으로 클래스이름 대신 this를 사용
            // @@!!!!!정의 생성자에서 다른생성자 호출 시 반드시 첫 줄에서만 호출 가능!!!!!!@@@@@
            // - 호출된 생성자가 변수값을 초기화하는 경우
            // 해당 생성자가 수행하는 작업을 유지하기 위함(무의미함 방지!)
            this(color,"auto",4);

            //객체생성시 색상만 작성하는 경우 - 색상 + auto + 문 5개
            door =5;


        }
        void displayInfo(){
            System.out.println(color + "/" + gearType + "/" + door);
        }

    }
//this 키워드
    //1. this
    // : 인스턴스 자신을 참조
    // : 모든 인스턴스 메서드와 생성자에서 사용 가능
    //2. this()
    //

public class Constructor {
    public static void main(String[] args) {
        Example1 a = new Example1();
        a.value = 10;
        System.out.println(a.value);

        //인스턴스 생성 시 반드시 인자값이 필요(초기화값)
        Example2 b = new Example2(10);
        System.out.println(b.value);

        System.out.println("=======Car 클래스 사용===");
        Car car1 = new Car(); //기본 생성자
        car1.color = "red";
        car1.door = 2;
        car1.gearType = "manual";
        car1.displayInfo();

        Car car2 = new Car("white", "auto", 4); //사용자 정의 생성자
        car2.displayInfo();

        Car car3 = new Car("blue");
        car3.displayInfo();



    }
}

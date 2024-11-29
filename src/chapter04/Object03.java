package chapter04;


        /*
        * 클래스의 구조
        * 필드(데이터를 표현하는 속성), 메서드(데이터의 동작), 생성자(데이터를 생성하는 역할)
        * */

class Car {
     String model;
     int year;


     //void 반환타입 : 해당 메서드(함수, 행동)의 반환하는 결과가 x
    //                 반환(return)이 존재하지 않을 경우 메서드명 앞에 반드시 작성
     void  displayInfo(){
         System.out.println("Model :" + model + ", year:" + year);
     }

     Car(String modelName, int year){
         //생성자 사용시
         //modelName: xc60, year: 2024
         //this 키워드
         //클래스 그 자체의 객체를 가리킴 객체 자신을 참조하는데 사용.
         //클래스의 필드와 생성자로 받아오는 데이터의 이름이 같을 경우 구분하기 위해 사용
         model = modelName;
         this.year = year;
     }

}

public class Object03 {
    public static void main(String[] args) {
        //클래스의 생성자를 호출, 객체의 초기상태를 설정
        //생성된 객체의 메모리; 주소를 반환하여 참조 변수에 저장
        //생성자 호출: 생성자명(필요한 매개변수...)
        //해당 객체에 대한 참조(주소)를 클래스 타입의 변수에 저장
        Car myCar = new Car("volvo xc60", 2024);
        //연산자를 사용하여 객체 내부의 필드와 메서드를 이용

        //1. 필드 접근
        //객체명.필드명;
        System.out.println(myCar.model);
        System.out.println(myCar.year);


        //2. 메서드 호출
        //객체명.메서드명();
        myCar.displayInfo();

        //객체 생성 구문
        //클래스명 객체명 = new 클래스명(생성자 매개변수);
        //클래스 타입
        //지정된 클래스를 기반으로 생성된 객체임으로 클래스 자체의 타입을 지님


    }
}

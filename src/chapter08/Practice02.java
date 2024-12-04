package chapter08;


// ===인터페이스 ===//
// Fruit 과일 인터페이스 정의
// - color :추상메서드
// - describe: 디폴트 메서드
// - printType: 정적 메서드


interface Fruit {
    void color();

    default void describe() {
        System.out.println("dsadsa");
    }

    static void printType(){
        System.out.println("static");
    }
}


class


public class Practice02 {
    public static void main(String[] args) {


    }
}

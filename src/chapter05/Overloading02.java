package chapter05;

/* 음식점 클래스
* 다양한 방법을 주문을 받는 메서드 정의
* */


import java.awt.image.Raster;

class Restaurant{
    //메서드 정의
    //: placeOrder 주문 메서드

    //>>메뉴이름(String dish)
    //>>메뉴이름, 수량 제공(int quantity)
    //>>메뉴이름, 특별 요청 사항(String specialRequests)
    //메뉴이름, 수량 제공, 특별요청사항
    void placeOrder(String dish){
        System.out.println(dish);
    }
     void placeOrder(String dish, int quantity){
        System.out.println(dish + " + " + quantity);
    }
     void placeOrder(String dish, String specialRequests){
        System.out.println(dish + " + " + specialRequests);
    }
     void placeOrder(String dish, int quantity, String specialRequests){
        System.out.println(dish + " + " + specialRequests + " + " + quantity);
    }
}

public class Overloading02 {
    public static void main(String[] args) {
        Restaurant a = new Restaurant();

        a.placeOrder("햄버거");
        a.placeOrder("피자", 2);
        a.placeOrder("파스타", "치즈 많이");
        a.placeOrder("샐러드", 2, "치즈 많이");


    }
}

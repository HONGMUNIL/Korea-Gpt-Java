package chapter07.orderApp;

/*
* product 클래스 ( 부모 클래스)
*
* - Field: name(제품명), price(제품가격)
* -Constructor : Product(name,price)*/
public class Product {
        private String name;
        private int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }

    //세금계산메서드
    double calculateTax(){
        return price * 0.1;
    }

}

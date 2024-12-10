package chapter13;


// ======주문 관리 시스템 ==========//
// 상품(Product)과 할인(Discount) 정보를 관리
// : 할인 정책을 적용 할 떄, 할인은 Product 또는 Product를 상속받는 하위클래스에서만 적용

// 1. 상위 클래스: Product
class Product{
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price= price;

    }
    public int getPrice() {
        return price;
    }
    public String getName(){
        return name;
    }

}

public class C_Generic {
    public static void main(String[] args) {




    }
}

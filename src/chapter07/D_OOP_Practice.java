package chapter07;

//==도서 관리 시스템==//
// :  책의정보를 저장, 책의 상태(대여가능여부)를 확인, 책의 정보를 출력
/*
* 1) Book 클래스
*  속성 : title, author, isAvailable(Boolean)
* 메서드 : 생성자(title, author), borrowBook(), returnBook(), displayInfo()
* 2) EBook 클래스 -Book 클래스를 상속
*  추가 속성 : fileSize(double)
* 추가 메서드: 생성자(title, author, fileSize)
*   오버라이딩(displayInfo + fileSize)
*  +) Book 클래스의 returnBook() 메서드에 final을 적용: 오버라이딩*/

class Book{
    private String title;
    private String author;
    private Boolean isAvailable = true;

    Book(String title, String author){
        this.author=author;
        this.title=title;
        //isAvailable = true;
    }

    //책 대여 메서드
    void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("책 대여가 성공적으로 완료되었습니다");
        }else{
            System.out.println("현재 대여 중입니다.");
        }
    }
    //책 반납 메서드
    //final 키워드 사용
    public final void returnBook(){
        if(!isAvailable){   //false //책이 대여중인 상태인지

            isAvailable = true;
            System.out.println("책 반납이 성공적으로 완료되었습니다");
        }else {
            System.out.println("이미 반납된 상태입니다.");
        }
    }
    //책 정보 메서드
    void displayInfo(){
        System.out.println("제목 : " + title + ", 저자 " + author + ", 대여 가능 여부: " + (isAvailable ? "대여가능" : "대여 중"));
    }
}

class EBook extends Book{
    private double fileSize;

    EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); //부모클래스 메서드 호출
        System.out.println("파일 크기 : " + fileSize + "MB");
    }
}
public class D_OOP_Practice {
    public static void main(String[] args) {
    Book book1 = new Book("나홀로집에", "홍문일");
    book1.displayInfo();
    book1.borrowBook();
    book1.borrowBook();
    book1.returnBook();
    book1.returnBook();

    EBook eBook1 = new EBook("해리포터", "홍문일", 867.00);
    eBook1.displayInfo();
    eBook1.borrowBook();



    }
}

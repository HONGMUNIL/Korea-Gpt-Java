package chapter02;

import java.util.Scanner;

public class B_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chapter를 선택하세요");
        System.out.println();
        int chapter = sc.nextInt();


        switch (chapter) {
            case 1:
                System.out.println("자바 기본 문법");
            case 2:
                System.out.println("자바 제어문 ~ 조건문/반복문");
            case 3:
                System.out.println("자바 배열");
                break;
            default:
                System.out.println("유효한 Chapter가 아닙니다");
        }


        sc.nextLine();

        System.out.println("과일을 입력하세요 : ");

        String fruit = sc.nextLine();
        switch (fruit){
            case "banana":
                System.out.println("바나나는 노랗다");
                break;
            case "strawberry":
                System.out.println("딸기는 빨갛다");
                break;
            case "grape":
                System.out.println("포도는 보라색이다");
                break;
            default:
                System.out.println("유효한 과일이 아닙니다");
        }


        sc.close();


    }
}

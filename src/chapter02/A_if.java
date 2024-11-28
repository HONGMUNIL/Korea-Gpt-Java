package chapter02;

import java.util.Scanner;

public class A_if {
    public static void main(String[] args) {

        int age = 10;

        if (age > 10) {
            System.out.println("성인입니다");
        } else {
            if (age > 13) {
                System.out.println("청소년입니다");
            } else {
                System.out.println("미성년자입니다");
            }
        }


        System.out.println("=======================");
        age = 15;
        if (age > 19) {
            System.out.println("성인입니다");
        } else if (age > 13) {
            System.out.println("청소년입니다");
        } else {
            System.out.println("미성년자입니다");
        }


        System.out.println("=========================");

        if(age > 19) System.out.println("주류");
        else if(age > 13) System.out.println("탄산");
        else System.out.println("쥬스");



        System.out.println("------------------------");


        String functionScope = null;

        System.out.println("x값 입력: ");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("y값 입력: ");
        int y= sc.nextInt();


        if(x> 0  && y > 0){
            functionScope = "제1사분면";
        }else if(x<0 && y>0){
            functionScope = "제2사분면";
        }else if (x<0 && y<0){
            functionScope = "제3사분면";
        }else{
            functionScope = "제4사분면";
        }

        System.out.println("결과 : " + functionScope);

        sc.close();

    }
}

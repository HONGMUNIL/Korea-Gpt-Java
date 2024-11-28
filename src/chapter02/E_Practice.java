package chapter02;

import java.util.Scanner;

public class E_Practice {
    public static void main(String[] args) {
         /*

        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력: ");
        int x = sc.nextInt();

        switch(x){
            case 90 :
                System.out.println();
            case 80 :

            case 70 :

            case 60 :
        }

        if (100<x || 0>x) {
            System.out.println("유효하지않은점수");
        }else if(x>=90){
            System.out.println("A");
        }else if(x>=80){
            System.out.println("B");
        }else if(x>=70){
            System.out.println("C");
        }else if(x>=60) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }

        System.out.println("===================");





        for(int i=1; i<=5; i++){ //변수 i는 몇 번째 줄인지를 저장
            for(int j=1; j<=i; j++){ //각 줄의 별 개수


                System.out.print("*");
            }
            System.out.println();
        }


        int rows = 5;

        for(int i=1; i<=rows; i++){
            for(int j=1; j <=rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
           System.out.println();
        }


        Scanner sc2 = new Scanner(System.in);
        int number;
        do {
        System.out.print("1부터 10사이의 숫자를 입력하세요 :");
        number= sc2.nextInt();

        } while (number <1 || number>10);
            System.out.print("입력 숫자는 :" + number);
            sc2.close();
        */
         int rows = 6;

        for(int i=1; i<=rows; i++){
            for(int j=1; j <=rows - i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }
           System.out.println();
        }


        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k <=rows - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

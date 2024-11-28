package chapter01;

public class E_Operation {
    public static void main(String[] args) {
        System.out.println(10 +20);
        System.out.println(10 -20);
        System.out.println(10 *20);
        System.out.println(10 /20); //몫
        System.out.println(10 %20); //나머지


        System.out.println("===============================");


        int number = 10;

        System.out.println(number++);
        System.out.println(number--);
        System.out.println(++number);
        System.out.println(--number);


        System.out.println("대입===============================");

        number =10;
        System.out.println(number += 3);
        System.out.println(number -= 3);
        System.out.println(number *= 3);
        System.out.println(number /= 3);
        System.out.println(number %= 3);
        System.out.println(number);


        System.out.println("비교========================");
        System.out.println(5>3);
        System.out.println(5<3);
        System.out.println(5>=3);
        System.out.println(5<=3);
        System.out.println(5==3);
        System.out.println(5!=3);


        System.out.println("논리========================");

       // &: 앰퍼샌드
       // |: 버티컬바(vertical bar)

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(!bool1);
        System.out.println(!bool2);
        System.out.println(3>2  && 1==1);
        System.out.println(1 != 1);
        System.out.println(3>=3 || 10<11 && !bool2);


        System.out.println(" 조건========================");
        int age= 17;
        System.out.println(age> 19 ? "성인입니다" : "미성년자입니다");


        int x= 10;
        int y= 2;
        System.out.println(x%y==0 ? "짝수" : "홀수");


        System.out.println(" 기타========================");

        String result = "이" + "승아";
        System.out.println(result);

        int num = (3 + 1 ) * 4;
        System.out.println(num);






    }
}

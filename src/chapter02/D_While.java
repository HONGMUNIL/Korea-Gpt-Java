package chapter02;

public class D_While {
    public static void main(String[] args) {
        int num = 1;


        while (num <= 5) {
            System.out.println(num);

            num++;

        }

        System.out.println("========================");
        int number = 0;
        while (true) {
            if (number % 2 == 0) {
                number++;
                continue;
            }
            System.out.println(number);
            number++;

            if(number ==20)break;
        }


    }
}

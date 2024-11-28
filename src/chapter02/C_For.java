package chapter02;

public class C_For {
    public static void main(String[] args) {

        for (int num = 0; num < 5; num++) {
            System.out.println(num);
        }
        System.out.println("==================");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i % 2 == 0 ? i : "");

        }

        System.out.println("==================");

        int num = 3;
        int result;
        for (int i = 1; i <= 9; i++) {
            result = num * i;
            System.out.println(num + "x" + i + "=" + result);
        }


        System.out.println("==================");


        for (int i = 0; i < 9; i++) {
            System.out.println("[" + i + "]");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i+ "x" + j+ "=" + (i * j));
            }
        }
    }
}

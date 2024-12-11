package chapter14;

/* 자바의 함수형 인터페이스를 보관하고 있는 패키지
 * import java.utill.function.*
 *
 *
 * 1. Predicate : 예측하다
 *  : 입력값을 받아 조건을 검사하는 데 사용
 * - 메서드 -
 *       =boolean test(T t) : 주어진 입력 값이 조건을 만족 하면 true를 반환 / 그렇지않으면 false 반환
 *       =and(Predicate other), or(Predicate other), negate() : Predicate 조합을 위해 사용
 *
 *
 *
 * 2. Funciton
 *  : 입력 값을 받아 특정 연산을 수행 한 후 결과를 반환
 *  : 메서드
 *       -R apply(T t): 입력값을 받아 변환한 값을 반환
 *       -andThen(Fuction after)
 *       -compose(Funtion before): 다른 Function의 결과를 현재 입력으로 연결
 *
 *
 *
 * 3. Consumer
 *  : 입력 값을 받아 소비(출력 또는 상태 변경) 하는데 사용
 *  : 메서드
 *       -void accept(T t): 입력값을 소비
 *       -andThen(Consumer after): 연속적인 소비 작업을 위해 사용
 *
 *
 * 4. Supplier
 *  : 값을 공급(생성)하는데 사용, 입력값이 필요로 하지 않는다
 *  : 외부에서 값을 가져오거나, 데이터를 생성하여 반환하는 역할
 *      -T get(): 반환
 *
 *
 *
 *
 * */


import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class E_Lambda {
    public static void main(String[] args) {
        //인터페이스<T> 메서드명 = T타입매개변수 -> 실행문
        //인터페이스<T, U> 메서드명 = (매개변수, 매개변수) -> 실행문
        // : 해당 람다 내에서 다양한 타입 활용
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;




        //기본 조건 검사
        System.out.println(isEven.test(4)); //true
        System.out.println(isEven.test(5)); //false




        //조건 결합 위의 조건 2로나눈 나머지가 0이면서 양수이면 true
        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
        System.out.println(isEvenAndPositive.test(4)); //true
        System.out.println(isEvenAndPositive.test(-4)); //false
        System.out.println(isEvenAndPositive.test(5)); //false







        // ===Function ====//
        //Type parameters:
        //<T> – the type of the input to the function
        //<R> – the type of the result of the function
        Function<String, Integer> stringLength = s -> s.length();
        Function<Integer, Integer> square = n -> n * n;

        System.out.println(stringLength.apply("Hello")); //5
        Function<String, Integer> lengthAndSquare = stringLength.andThen(square);
        System.out.println(lengthAndSquare.apply("Hello")); //25




        //=======Consumer=========//
        Consumer<String> printMessage = msg -> System.out.println(msg);
        Consumer<String> printLength = msg -> System.out.println(msg.length());

        printMessage.accept("안녕하냐");
        Consumer<String> combinedConsumer = printMessage.andThen(printLength);
        combinedConsumer.accept("안녕하냐고");






        //=====supplier=====//
        Supplier<Double> randomValue = () -> Math.random(); // 09.0과 0.1의 난수
        System.out.println(randomValue.get()); //0.91076442121831







        //====Map 활용 람다식 ===//
        Map<String, Integer> scores = new HashMap<>();
        scores.put("홍문일", 51);
        scores.put("집에가", 90);
        scores.put("고싶다", 100);

        scores.forEach((name, score) -> System.out.println(name + " : " + score));


    }
}





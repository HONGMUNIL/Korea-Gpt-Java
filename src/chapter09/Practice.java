package chapter09;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("생년월일을 입력하세요 (형식: yyyy-MM-dd): ");
        String input = scanner.nextLine();


            LocalDate birthDate = LocalDate.parse(input, formatter);
            //parse : 분석하다
            //parse(a,b): a를 b의 형태로 재구성
            System.out.println("입력한 생년월일: " + birthDate);


        //현재날짜구하기
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //올해의 생일 계산
        //.withYear()
        // : 년도를 조작하는 메서드

        LocalDate nextBirthday = birthDate.withYear(today.getYear());

        //생일이 이미 지났다면 내년으로 설정
        if(nextBirthday.isBefore(today) || nextBirthday.isEqual(today)){
            nextBirthday = nextBirthday.plusYears(1);
        }

        //6. 남은 일수 계산
        //ChronoUnit.DAYS : java.time 패키지에서 날짜와 시간 간의 차이를 계산할 때 사용
        long dayUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);


        //7. 결고ㅏ출력
        System.out.println("남은 생일까지 " + dayUntilBirthday + " 일 남았습니다");
    }
}

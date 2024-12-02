package chapter03;

public class A_Array {
    public static void main(String[] args) {
        /*배열
        * 같은 타입의 여러 변수를 하나의 집합으로 묶어서 처리하는  자료구조
        * 데이터를 연속적으로 저장
        * 순서 0
        * 중복 0
        * */
        //1)변수
        int korean= 90;
        int math=75;
        int english=80;

        //2)배열
        //생성하여 사용 - new 연산자

        //배열의 선언
        //생성한 배열을 담을 그릇
        //>>데이터타입[] 배열명;
        //>>데이터타입 배열명[];

        int[] array;

        //배열의 생성
        //실제 데이터가ㅣ 저장x 데이터 배열이 저장된 첫 번쨰 메모리 주소가 저장
        //>> new 데이터타입[배열의길이];
        array = new int[3];

        System.out.println(array);
        //배열의 요소에 접근
        //배열명[인덱스번호]
        //데이터변경(삽입): 배열명[인덱스 번호] = 데이터값;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //배열 생성시 모든 요소는 해당 데이터 타입의 기본값으로 초기화
        //숫자는 (0) 문자열은 ('') 논리형은 (false)

        array[1] = 456;
        array[0] = 123;
        System.out.println(array[1]);
        System.out.println(array[0]);

        //배열의 선언과 동시에 초기화
        //new 연산자를 사용한 직접적인 배열 생성시 길이 지정 x
        //요소의 개수를 파악하여 배열의 길이를 자동 지정
        //1) 데이터타입[] 배열명 = new 데아터타입[] {요소1.요소2...};
        //2)데이터타입[] 배열명 = {요소1, 요소2...}

        int[] scoreList = new int[]{90,85,100};
        System.out.println(scoreList[0]);

        char[] greet = {'h','e','l','l','o'};
        System.out.println(greet[0]);
        System.out.println(greet[1]);
        System.out.println(greet[2]);
        System.out.println(greet[3]);
        System.out.println(greet[4]);


        //배열의 길이
        //length 속성으로 확인
        System.out.println("배열의길이 : " + greet.length);

        //배열의 특징
        //한번 생성되면 크기 변경 x
        //참조 타입 : 주소값이 저장
        // 모든 요소는 같은 자료형이어야 함


        //문자열 배열 생성
        //String 타입 배열의 초기값은 null

        String[] fruits = new String[3];
        System.out.println(fruits[0]);

        fruits[0] = "사과";
        System.out.println(fruits[0]);

        //배열 요소 삭제
        //삭제 기능을 담당하는 문법x
        //삭제할 요소를 제외한 나머지 요소를 새로운 배열로 복사
        int[] original = {1,2,3,4};
        int removeIndex = 2;

        int[] newArray = new int[original.length - 1];
        int k = 0;

        int originalLength = original.length;

        for(int index = 0; index < originalLength; index++){
            if(index == removeIndex){
                continue;//루프의 나머지 부분을 건너뛰고 다음 반복을 진행
            }

            newArray[k++]= original[index];


        }
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[2]);

        /*배열을 순회하는 향상된 for문
        * for (데이터타입 변수명: 해당 데이터타입의 배열){
        * 배열의 모든 요소에 순차적으로 접근하는 코드
        * }
        * */
        System.out.println("+===================================================");
        int[] arrayNumber= {1,3,5,7,9};
        for(int number : arrayNumber){
            System.out.print(number + " ");
        }
        System.out.println();
        //배열 활용 예시
        //학생 점수 평균 계산
        int[] scores = {85, 100, 75, 60, 90};
        int total = 0;
        double average = 0.0;

        for(int i = 0; i<scores.length; i++){
            total+=scores[i];
            average = total/scores.length;
        }

        System.out.println("평균 점수는 :" + average);


    }
}

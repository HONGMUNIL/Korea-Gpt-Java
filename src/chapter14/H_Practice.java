package chapter14;


// == 컬렉션 프레임워크 & 스트림 API & 람다 표현식 & 메서드참조 ===//

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1. 학생 목록 필터링 &정렬
@Getter
@ToString
@AllArgsConstructor
class StudentsClass{
    private String name;
    private int age;
    private double grade;

}






public class H_Practice {
    public static void main(String[] args) {
        //1. 학생 목록 필터링 & 정렬
        List<StudentsClass> studentsClasses = Arrays.asList(
                new StudentsClass("홍문일", 29, 4.3),
                new StudentsClass("박정아", 30, 4.1),
                new StudentsClass("이정희", 40, 3.7),
                new StudentsClass("김규태", 21, 3.5)
        );
        //1-1. 학점이 3.0 이상인 학생 필터링

        List<StudentsClass> filteredStudents = studentsClasses.stream()
                .filter(students ->students.getGrade() >=3.0)
                .collect(Collectors.toList());
        System.out.println("3.0 학생:");
        filteredStudents.forEach(System.out::println);

        //1-2 학생 이름 목록만 추출
        List<String> studentNames = studentsClasses.stream()
                .map(StudentsClass::getName) //밑의  map과 똑같다
          //    .map(studentsClass -> studentsClass.getName())
                .collect(Collectors.toList());

        System.out.println("학생이름 목록:");
        System.out.println(studentNames); //[홍문일, 박정아, 이정희, 김규태]


        //1-3 학생들을 점수순으로 정렬
        List<StudentsClass> sortedStudents = studentsClasses.stream()
                .sorted(Comparator.comparingDouble(StudentsClass::getGrade))
                .collect(Collectors.toList());

        System.out.println("점수순으로 :");
        sortedStudents.forEach(System.out::println);
        //StudentsClass(name=김규태, age=21, grade=3.5)
        //StudentsClass(name=이정희, age=40, grade=3.7)
        //StudentsClass(name=박정아, age=30, grade=4.1)
        //StudentsClass(name=홍문일, age=29, grade=4.3)



        //1-4 학생들 중 '지' 단어가 이름에 포함된 학생 필터링
        List<StudentsClass> studentsWithJi = studentsClasses.stream()
                .filter(studentsClass -> studentsClass.getName().contains("문"))
                .collect(Collectors.toList());
        System.out.println("이름에 문이 들어간 학생 :");
        studentsWithJi.forEach(System.out::println); //StudentsClass(name=홍문일, age=29, grade=4.3)



   }

}






package chapter14;


//== 직원 관리 시스템 ==//

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//2. 직원 목록 필터링 & 정렬
@Getter
@ToString
@AllArgsConstructor
class Employee {
    private String department;
    private String name;
    private double salary;
}


public class I_Practice {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("IT", "홍문일", 5000),
                new Employee("HR", "박정아", 7000),
                new Employee("IT", "김현수", 9000),
                new Employee("Finacnce", "황영수", 4000),
                new Employee("HR", "한설빈", 6500)
        );

        //1. 급여가 6000 이상인 직원 필터링
        List<Employee> highEmployee = employees.stream()
                .filter(employs -> employs.getSalary() >= 6000)
                .collect(Collectors.toList());
        System.out.println("급여가 6000이상인 직원 필터링 : ");
        highEmployee.forEach(System.out::println);


        //2. IT부서가 직원의 이름만 추출
        List<Employee> itEmployee = employees.stream()
                .filter(employeeName -> employeeName.getDepartment().contains("IT"))
                .collect(Collectors.toList());
        System.out.println("IT부서인 직원 :");
        itEmployee.forEach(System.out::println); //<< 이건 모든정보가 추출 이름만 추출해야함!

       List<String> itEmployeeNames = employees.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()))
                .map(Employee::getName)
                .collect(Collectors.toList());
       System.out.println("IT부서인 직원 :");
       itEmployeeNames.forEach(System.out::println); //<< 이게 이름만 추출한것

        //3. 특정 부서(HR) 직원 중 이름에 '한' 가 들어간 직원 필터링
         List<Employee> employeesWithJo = employees.stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .filter(employee -> employee.getName().contains("조"))
                .collect(Collectors.toList());

    }
}

package chapter14;


//== 직원 관리 시스템 ==//

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
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




        //4. 부서별 직원 그룹화
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeesByDept);
        //{Finacnce=[Employee(department=Finacnce, name=황영수, salary=4000.0)], HR=[Employee(department=HR,
        // name=박정아, salary=7000.0), Employee(department=HR, name=한설빈, salary=6500.0)],
        // IT=[Employee(department=IT, name=홍문일, salary=5000.0), Employee(department=IT, name=김현수, salary=9000.0)]}

        //5. 부서별 평균 급여 계산
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

  //      Map<String, Double> avgSalaryByDept2 = employees.stream()
  //              .collect(Collectors.groupingBy(Employee::getDepartment,
   //                     Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryByDept);
    }
}









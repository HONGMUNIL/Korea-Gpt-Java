package chapter12.model;

public class Student {
    private String name;
    private int age;
    private String studentId;


    public Student(String name, int age, String studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString(){
        return "Name : " + name + "Age : " + age + "StudentId : " + studentId;
    }





}

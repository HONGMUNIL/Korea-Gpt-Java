package chapter13;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class LombokExample {
    private String name;
    private int age;
}


public class G_Lombok {
    public static void main(String[] args) {
        LombokExample lombokExample = new LombokExample();
    lombokExample.setName("이승아");
    lombokExample.setAge(23);
        System.out.println(lombokExample.getName());
        System.out.println(lombokExample.getAge());

    }

}

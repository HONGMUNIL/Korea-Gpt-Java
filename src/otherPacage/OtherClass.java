package otherPacage;

/*부모 클래스*/
public class OtherClass {
    //같은 패키지 또는 다른 패키지의 하위 클래스에서만  접근 가능
    protected String othermyField = "다른패키지의 필드";
    protected void othermyMethod(){
        System.out.println("다른 패키지에 있는 부모클래스");
    }

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        System.out.println(publicClass.publicField);
        publicClass.publicMethod();
    }


}
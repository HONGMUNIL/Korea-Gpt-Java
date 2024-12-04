package chapter08;

//추상 클래스
// : 모바일 애플리케이션
abstract class MobileApp {
    //추상 메서드
    //: 실행에 대한 동작 정의
    // - 반드시 각 앱마다 "고유한 실행"을 정의
    abstract void execute();

    //일반 메서드
    // : 앱 정보를 출력
    void appInfo() {
        System.out.println("This is a mobile app");
    }
}


//== 게임 애플리케이션 ==//
class GameApp extends MobileApp {
    void execute() {
        System.out.println("Game App executes");
    }
}


// == SNS 애플리케이션 == //
class SocialApp extends MobileApp {
    String name;

    SocialApp(String name) {
        this.name = name;
    }

    //추상 메서드 구현
    void execute() {
        System.out.println(name + " app execute");
    }

    void appInfo() {
        System.out.println(name + " app is most popular social app");
    }


    //socialApp 고유 메서드
    void sharaContent(String content) {
        System.out.println(name + "shares: " + content);
    }
}


public class Practice01 {
    public static void main(String[] args) {
        //== 다형성 적용 ==//
        MobileApp gameApp = new GameApp();
        MobileApp socialApp = new SocialApp("Instagram");


        // 다형성에 의해 공통 메서드는 호출 가능
        gameApp.execute();
        gameApp.appInfo();      //부모(추상)클래스의 일반 메서드

        socialApp.execute();
        socialApp.appInfo();        //자식 클래스의 재정의 메서드

        // socialApp.shareContent("images"); -Error (고우의 메서드에 접근 불가)

        //==형 변환(Type Casting) == //
        //: MobileApp 타입을 SocialApp 타입으로 변환하여 고유 메서드 사용

        if (socialApp instanceof GameApp) {
            System.out.println("socialApp 은 GameApp 입니다");
            GameApp onlyGameApp = (GameApp) socialApp;
        } else if (socialApp instanceof SocialApp) {
            System.out.println("socialApp 은 socialApp 입니다");
            SocialApp onlySocialApp = (SocialApp) socialApp;
            onlySocialApp.sharaContent("images"); //고유 메서드 사용 가능
        }

        // == 객체 배열고 ㅏ다형성 활용 ===//

        // 배열 선언: 데이터타입[] 변수명 = { 요소1, 요소2.....}
        MobileApp[] apps = {
                //생성과 동시에 업캐스팅 - 묵시적 형 변환
                new GameApp(),
                new SocialApp("Facebook"),
                new SocialApp("Twitter")
        };
        for(MobileApp app : apps){
            app.execute();
            app.appInfo();

            //SocialApp 인지 확인하고 고유 메서드 사용 가능
            if(app instanceof SocialApp){
                SocialApp specificSocialApp = (SocialApp) app;
                specificSocialApp.sharaContent("File");
            }


        }

    }
}

package chapter14.practice;



// User, SignUp(회원가입), Request(요청). Dto(데이터 변환 객체)

//  DTO(Date Transfer Object)
// : 데이터 전송 객체
// : 프로세스 간에 데이터를 전달하는 객체
// - 계층간 데이터 전송을 위해 사용하는 객체


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignUpRequestDto {

    private String username;
    private String userId;
    private String password;
    private String passwordCheck;
    private String email;
    private String phone;
    private String nickname;


}










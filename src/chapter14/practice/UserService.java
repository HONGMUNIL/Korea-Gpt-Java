package chapter14.practice;


import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    public static User signUp(UserSignUpRequestDto dto) {
        String password = dto.getPassword();
        String passwordCheck = dto.getPasswordCheck();

        if (!password.equals(passwordCheck)) {
            throw new Error("비밀번호와 비밀번호확인이 일치하지 않습니다");

        }
        Long id = 1L;
        Date nowDate = new Date();

        User user = User.builder()
                .id(id)
                .userId(dto.getUserId())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .nickname(dto.getNickname())
                .phone(dto.getPhone())
                .username(dto.getUsername())
                .signUpDate(nowDate)
                .build();

        return user;

    }

    public static void main(String[] args) {
        UserSignUpRequestDto dto1 = new UserSignUpRequestDto(
                "123", "1234", "1234", "1234", "qwer", "1234"
                , "홍홍홍"
        );
        User user1 = signUp(dto1);
        System.out.println(user1.getSignUpDate()); //Thu Dec 12 12:06:22 KST 2024


        List<User> userList = null;

        List<UserSignUpRequestDto> dtos = new ArrayList<>();
        dtos.add(new UserSignUpRequestDto("홍문일", "1234", "1234", "1234", "qwer", "1234"
                , "홍홍홍"));
        dtos.add(new UserSignUpRequestDto("홍문일22", "1234", "1234", "1234", "qwer", "1234"
                , "홍홍홍"));
        dtos.add(new UserSignUpRequestDto("홍문일33", "1234", "1234", "1234", "qwer", "1234"
                , "홍홍홍"));

        userList = dtos.stream()
                .map(dto -> signUp(dto))
                .collect(Collectors.toList());

         userList = dtos.stream()
                .map(UserService:: signUp)
                .collect(Collectors.toList()); //위의 기능과 동일하다

        userList.forEach(System.out::println);

    }
}

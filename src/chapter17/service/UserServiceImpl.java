package chapter17.service;

import chapter17.entity.User;
import chapter17.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private User loggedInUser; // 로그인된 사용자 정보를 저장하고 있는 필드


    public UserServiceImpl() {
        this.userRepository = new UserRepository();
    }

    @Override
    public void registerUser(String userId, String password, String name, String email) {
        userRepository.save(new User(userId, password, name, email));
        System.out.println("사용자 회원 가입 완료:" + name);
    }

    @Override
    public void login(String userId, String password) {
        // 전달 받은 userId에 대한 검증
        userRepository.findByUserId(userId).ifPresentOrElse(user -> {
            // 해당 userId 의 회원 정보에서 전달 받은 password가 일치하는지 확인
            if () {

            } else {

            }
        }, () -> System.out.println("로그인 실패: 사용자 Id를 찾을 수 없습니다"));
    }

    @Override
    public void logout() {

    }
}
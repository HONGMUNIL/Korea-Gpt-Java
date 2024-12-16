package chapter17.entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*
* ================ 프로젝트 개요===========
*   : 온라인 예약 시스템
*
* 1) 기능
*       사용자 관리: 사용자 등록(회원가입), 로그인, 로그아웃 기능
*       예약 관리: 사용자가 특정 시간에 예약할 수있는 기능
*       예약 확인: 사용자가 자신의 예약 내역을 확인할 수 있는 기능
*       예약 취소: 사용자가 예약을 취소할 수 있는 기능
*
*
*
* 2) 프로그램 구성 요소
*       - 모델 : 사용자, 예약 정보 클래스
*       - 서비스: 사용자, 예약 관련 비즈니스 로직
*       - 컨트롤러 : 사용자 요청을 처리하고 응답하는 역할
*       - 저장소 : 데이터 처리에 사용, 데이터 베이스와의 상호작용을 담당
*
* 3) 프로젝트 구조
* entity  : User, Reservation
* service : UserService, ReservationService
* controller : UserController, ReservationController
* repository : UserRepository, ReservationRepository
*
*
*
*
* */
@RequiredArgsConstructor
@Getter
public class Reservation {
    // 각 예약이 가지는 고유한 id 값
   private final String reservationId;
   private final String userId;
    private final String reservationTime;
    //초기값 설정
    // : 해당 예약의 활성화 상태를 저장
    // - true : 에약 완료
    // - false : 예약 취소
    private boolean isActive = true;

    public void cancel(){
        this.isActive = false;


    }

    @Override
    public String toString(){
        String isActiveMessage = isActive ? "예약 중": "예약 취소";
        return "[예약 ID: " + reservationId + ", 사용자 ID: " + userId + ", 예약 일자 :" + reservationTime
                 + ",예약 상태: " + isActive + "]";
    }
}

package chapter15.boardApp.view;


import chapter15.boardApp.controller.BoardController;
import chapter15.boardApp.dto.BoardRequestDto;
import chapter15.boardApp.dto.BoardResponseDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    public static void main(String[] args) {
        BoardController boardController = new BoardController();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.println(" [ 게시판 관리 시스템 ]");
                System.out.println("1.  게시판 전체 조회 ");
                System.out.println("2.  게시판 단건 조회 ");
                System.out.println("3.  게시판 등록 ");
                System.out.println("4.  게시판 수정 ");
                System.out.println("5.  게시판 삭제 ");
                System.out.println("0.  종료 ");
                System.out.print("선택: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); //버퍼 제거

                switch (choice) {
                    case 1:
                        boardController.getAllBoards();
                        break;
                    case 2:
                        System.out.print("조회할 게시글 ID:");
                        long id = scanner.nextLong();
                        boardController.getBoardById(id);
                        break;
                    case 3:
                        System.out.print("제목 :");
                        String title = scanner.nextLine();
                        System.out.print("내용 :");
                        String content = scanner.nextLine();
                        System.out.print("저자 :");
                        String author = scanner.nextLine();
                        boardController.createBoard(new BoardRequestDto(title, content, author));
                        break;
                    case 4:
                        System.out.print("수정할 게시글 ID:");
                        long updateId = scanner.nextLong();
                        scanner.nextLine(); //버퍼 제거 scanner를 또 쓰기떄문에
                        System.out.print("새 제목:");
                        String newTitle = scanner.nextLine();
                        System.out.print("새 내용:");
                        String newContent = scanner.nextLine();
                        boardController.updateBoard(updateId, new BoardRequestDto(newTitle, newContent, null));
                        break;
                    case 5:
                        System.out.print("삭제할 게시글 ID: ");
                        long deleteId = scanner.nextLong(); //버퍼제거 불필요, 또 안쓰니까
                        boardController.deleteBoard(deleteId);
                        break;
                    case 0:
                        System.out.println("==== 종료 ====");
                        scanner.close();
                        return; //반복문 종료

                    default:
                        System.out.println("잘못된 선택입니다, 0-5사이의 숫자를 입력하세요");
                }

            } catch (InputMismatchException e) {
                System.out.println("입력이 유효하지 않습니다. 숫자를 입력하세요 ");
                scanner.nextLine(); //유효하지않은 값을 제거 ,int값으로 받아오고 버퍼도 제가
            } catch (IllegalArgumentException e) {
                //인수값으로 부적절한 값을 넘길 때 던지는 예외
                System.out.println("오류 :" + e.getMessage());
            }
        }


    }
}

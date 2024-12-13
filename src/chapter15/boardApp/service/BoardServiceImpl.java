package chapter15.boardApp.service;

import chapter15.boardApp.dto.BoardRequestDto;
import chapter15.boardApp.dto.BoardResponseDto;
import chapter15.boardApp.entity.Board;
import chapter15.boardApp.repository.BoardRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    public BoardServiceImpl() {
        this.boardRepository = new BoardRepository();
    }

    @Override
    public List<BoardResponseDto> findAll() {
        // DB에서 게시판 전체 데이터 가져오기
        List<Board> boardList = boardRepository.findAll();

        // 게시판 데이터를 응답 객체로 변환
        List<BoardResponseDto> boardResponseDtos = boardList.stream()
                .map(BoardResponseDto::fromEntity)
                .collect(Collectors.toList());
        //boardResponseDtos 로 변환 이유: 사용자한테
        // 응답 객체 반환
        return boardResponseDtos;
    }

    @Override
    public BoardResponseDto findById(long id) {
        // 요청: 매개변수의 id 데이터를 DB에서 검색 후 반환
        Optional<Board> board = boardRepository.findById(id);

        // 해당 데이터를 응답 객체로 변환
        BoardResponseDto boardResponseDto = board
                .map(BoardResponseDto::fromEntity) //<<이 코드는 board 객체를 BoardResponseDto로 변환하는코드
                // 응답 객체로 변환 시 null값이 존재한다면 예외 발생
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));

        // 변환 하는 이유가 사용자한테 id title author만 보여주는 형태로 만들려고인가
        return boardResponseDto;
    }

    @Override
    public void save(BoardRequestDto boardRequestDto) {
        Board board = boardRequestDto.toEntity(); // id를 제외한 필드에 사용자의 요청값을 할당
        boardRepository.save(board);
    }

    @Override
    public void update(long id, BoardRequestDto boardRequestDto) {
        Board existingBoard = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
        existingBoard.setTitle(boardRequestDto.getTitle());
        existingBoard.setContent(boardRequestDto.getContent());
    }

    @Override
    public void delete(long id) {
        if (!boardRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("삭제할 게시글이 존재하지 않습니다.");
        }
        boardRepository.delete(id);
    }
}
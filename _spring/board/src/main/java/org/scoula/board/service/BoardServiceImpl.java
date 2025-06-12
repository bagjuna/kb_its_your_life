package org.scoula.board.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.scoula.board.dto.BoardDTO;
import org.springframework.stereotype.Service;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    final private BoardMapper mapper;

    @Override
    public List<BoardDTO> getList() {
        return mapper.getList().stream()
                .map(BoardDTO::of)
                .toList();
    }

    @Override
    public BoardDTO get(Long no) {
        BoardDTO board = BoardDTO.of(mapper.get(no));
        return Optional.ofNullable(board).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void create(BoardDTO board) {
        log.info("게시글 등록: {}", board);
        mapper.create(board.toVO());
        log.info("게시글 등록 완료");
    }

    @Override
    public boolean update(BoardDTO board) {
        log.info("게시글 수정: {}", board);
        int result = mapper.update(board.toVO());
        if (result == 1) {
            log.info("게시글 수정 완료");
            return true;
        } else {
            log.warn("게시글 수정 실패: {}", board);
            return false;
        }
    }

    @Override
    public boolean delete(Long no) {
        log.info("게시글 삭제: {}", no);
        int result = mapper.delete(no);
        if (result == 1) {
            log.info("게시글 삭제 완료");
            return true;
        } else {
            log.warn("게시글 삭제 실패: {}", no);
            return false;
        }
    }
}
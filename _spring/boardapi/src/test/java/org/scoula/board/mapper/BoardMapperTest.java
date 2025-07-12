package org.scoula.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.domain.BoardVO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j2
public class BoardMapperTest {
    @Autowired
    private BoardMapper mapper;
    @Test
    @DisplayName("BoardMapper의 목록 불러오기")
    public void getList() {
        for(BoardVO board : mapper.getList()) {
            log.info(board);
        }
    }

    @Test
    @DisplayName("BoardMapper의 단건 조회")
    public void get() {
        // 조회할 게시글 번호
        BoardVO board = mapper.get(2L);
        assertNotNull(board, "게시글이 null이 아닙니다.");
        log.info(board);
    }

    @Test
    @DisplayName("BoardMapper의 게시글 생성")
    public void create() {
        BoardVO board = BoardVO.builder()
                .title("새로운 게시글")
                .content("게시글 내용입니다.")
                .writer("작성자")
                .build();

        mapper.create(board);
        log.info("생성된 게시글 번호: " + board.getNo());
        assertNotNull(board.getNo(), "게시글 번호가 null이 아닙니다.");
    }

    @Test
    @DisplayName("BoardMapper의 게시글 수정")
    public void update() {
        long no = 5L;
        BoardVO board = mapper.get(no);
        assertNotNull(board, "수정할 게시글이 null이 아닙니다.");

        board.setTitle("수정된 제목");
        board.setContent("수정된 내용");

        int result = mapper.update(board);
        assertEquals(1, result, "게시글 수정이 성공적으로 이루어졌습니다.");

        BoardVO updatedBoard = mapper.get(no);
        assertEquals("수정된 제목", updatedBoard.getTitle(), "제목이 수정되었습니다.");
        assertEquals("수정된 내용", updatedBoard.getContent(), "내용이 수정되었습니다.");
    }

    @Test
    @DisplayName("BoardMapper의 글 삭제")
    public void delete() {
        log.info("DELETE COUNT: " + mapper.delete(3L));
    }

}
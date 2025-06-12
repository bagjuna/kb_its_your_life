package org.scoula.board.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.dto.BoardDTO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class} )
@Log4j2
class BoardServiceTest {

    @Autowired
    private BoardService service;

    @Test
    public void getList() {
        for(BoardDTO board: service.getList()) {
            log.info(board);
        }
    }

    @Test
    public void get() {
        BoardDTO board = service.get(1L);
        assertNotNull(board, "게시글이 null이 아닙니다.");
        log.info(board);
    }


}
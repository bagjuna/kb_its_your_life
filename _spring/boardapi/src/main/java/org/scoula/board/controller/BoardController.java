package org.scoula.board.controller;

import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Log4j2
@Api(tags = "게시글 관리")
public class BoardController {
    private final BoardService service;

    @ApiOperation(value = "게시글 목록", notes = "게시글 목록을 얻는 API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로 요청이 처리되었습니다.", response = BoardDTO.class),
            @ApiResponse(code = 400, message = "잘못된 요청입니다."),
            @ApiResponse(code = 500, message = "서버에서 오류가 발생했습니다.")
    })
    @GetMapping("")
    public ResponseEntity<List<BoardDTO>> getList() {
        return ResponseEntity.ok(service.getList());
    }


    @ApiOperation(value = "상세정보 얻기", notes = "게시글 상제 정보를 얻는 API")
    @ApiResponses(value = {
    @ApiResponse(code = 200, message = "ㅇㄹㅇㄹ", response = BoardDTO.class),
    @ApiResponse(code = 400, message = "ㅇㄹㅇ"),
    @ApiResponse(code = 500, message = "ㅇㄹㅇ")
    })
    @GetMapping("/{no}")
    public ResponseEntity<BoardDTO> get(
            @ApiParam(value = "게시글 ID", required = true, example = "1")
            @PathVariable Long no) {
        return ResponseEntity.ok(service.get(no));
    }

    @ApiOperation(value = "게시글 생성", notes = "게시글 생성 API")
    @PostMapping("")
    public ResponseEntity<BoardDTO> create(
            @ApiParam(value = "게시글 객체", required = true)
            @RequestBody BoardDTO board) {
        return ResponseEntity.ok(service.create(board));
    }

    @PutMapping("/{no}")
    public ResponseEntity<BoardDTO> update(@PathVariable Long no, @RequestBody BoardDTO board) {
        return ResponseEntity.ok(service.update(board));
    }

    @DeleteMapping("/{no}")
    public ResponseEntity<BoardDTO> delete(@PathVariable Long no) {
        return ResponseEntity.ok(service.delete(no));
    }
}
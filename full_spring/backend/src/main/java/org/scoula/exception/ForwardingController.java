package org.scoula.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * API 경로 및 정적 리소스를 제외한 모든 GET 요청을 처리하여
 * SPA(Single Page Application)의 클라이언트 사이드 라우팅을 지원하는 컨트롤러.
 * 어떤 경로로 접속하든 항상 index.html을 먼저 렌더링하도록 포워딩합니다.
 */
//
//@Controller
//public class ForwardingController {
//
//    /**
//     * 경로에 .(점)이 포함되지 않은 모든 요청을 처리합니다.
//     * 이 규칙 덕분에 /style.css, /main.js 와 같은 정적 파일 요청은
//     * 이 컨트롤러의 영향을 받지 않습니다.
//     *
//     * @return index.html로 포워딩하는 경로 문자열
//     */
//    @RequestMapping(value = {"/{path:[^\\.]*}", "/**/{path:[^\\.]*}"})
//    public String forward() {
//        return "forward:/resources/index.html";
//    }
//
//}
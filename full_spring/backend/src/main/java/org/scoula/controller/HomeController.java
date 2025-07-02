package org.scoula.controller;


import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String home() {
        return  "index"; // resources/index.html로 매핑됨
    }
}

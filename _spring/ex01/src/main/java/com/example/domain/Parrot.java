package com.example.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

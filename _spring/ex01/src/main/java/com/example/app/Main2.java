package com.example.app;

import com.example.config.ProjectConfig2;
import com.example.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

    }
}
package com.example.app;

import com.example.config.ProjectConfig;
import com.example.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println("Parrot name: " + p.getName());
    }
}
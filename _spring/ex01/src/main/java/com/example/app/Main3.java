package com.example.app;

import com.example.config.ProjectConfig3;
import com.example.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
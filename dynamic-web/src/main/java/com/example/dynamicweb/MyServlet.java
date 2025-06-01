package com.example.dynamicweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MyServlet", urlPatterns = {"/xxx", "/yyy"})
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    }

    @Override
    public void destroy() {
        System.out.println("destroy 호출");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init호출");
    }
}
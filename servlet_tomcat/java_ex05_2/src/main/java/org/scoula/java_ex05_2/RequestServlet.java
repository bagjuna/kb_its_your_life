package org.scoula.java_ex05_2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //속성 설정
        req.setAttribute("username", "홍길동");
        req.setAttribute("useraddress", "서울");
        //forward
        RequestDispatcher dis = req.getRequestDispatcher("/res.jsp");
        dis.forward(req, res);
    }
}
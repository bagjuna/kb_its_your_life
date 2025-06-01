package org.scoula.ex02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(list.size(), 2);
        list.add(list.size(), 3);
        int[] arr;
        arr = list.stream().mapToInt(i -> i).toArray();
    }

    public void destroy() {
    }
}
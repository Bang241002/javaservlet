package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/test-response"})
public class ResponeServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Xin chao Luong Viet Hoang</h1>");

        resp.addCookie(new Cookie("a","a"));

        resp.addHeader("a", "aaa");

        resp.sendError(200);
    }
}

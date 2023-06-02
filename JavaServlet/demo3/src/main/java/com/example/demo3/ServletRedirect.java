package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/chuyen-huong-trang"})
public class ServletRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendRedirect("https://www.youtube.com/watch?v=Qd2Sb_5MVDQ&list=PLsfLgp1K1xQ53rzo7vo2dKamBu0bj7lkv&index=12");

        resp.setStatus(resp.SC_MOVED_PERMANENTLY);
        resp.setHeader("Location", "https://www.youtube.com/watch?v=Qd2Sb_5MVDQ&list=PLsfLgp1K1xQ53rzo7vo2dKamBu0bj7lkv&index=12");
    }
}

package com.trungtamjava.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/hello-session"})
public class Session1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession = req.getSession();//.getSession sẽ tạo ra một session ms nếu trên sr chưa có
                                                    // hoặc đọc 1 session đã có sẵn
        httpSession.setAttribute("name","luong viet hoang");

        httpSession.setAttribute("age", new Integer(28));

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Xin chao Luong Viet Hoang - set session");
    }
}

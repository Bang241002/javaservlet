package com.luongviethoang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;


public class Logger implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter1");

        filterChain.doFilter(servletRequest, servletResponse);

        servletResponse.setContentType("text/plain");
    }

    @Override
    public void destroy() {

    }
}

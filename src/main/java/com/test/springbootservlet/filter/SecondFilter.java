package com.test.springbootservlet.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入拦截器...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("跳出拦截器...");
    }

    @Override
    public void destroy() {

    }
}

package com.test.springbootservlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//@WebFilter(filterName = "firstFilter",urlPatterns = {"*.do","*.jsp"})//用来配置多种类型监听文件设置
@WebFilter(filterName = "firstFilter",urlPatterns = "/first")//单配置
public class FirstFilter implements Filter {
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

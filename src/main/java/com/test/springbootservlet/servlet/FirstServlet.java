package com.test.springbootservlet.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstServlet",urlPatterns = "/first")//Spring Boot启动时会会扫描@WebServlet注解并将注解该类进行例化
public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        System.out.println("first servlet....");
    }


}

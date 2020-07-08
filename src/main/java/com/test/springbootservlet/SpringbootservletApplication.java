package com.test.springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan //用来扫描所有与Servlet相关组件的注解（@WebServlet  @WebFilter @WebListener）
public class SpringbootservletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootservletApplication.class, args);
    }

}

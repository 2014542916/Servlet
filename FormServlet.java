package com.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", value = "/FormServlet")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置字符集
        request.setCharacterEncoding("UTF-8");

        response.setContentType("text/html;charset='UTF-8'");
        response.setCharacterEncoding("UTF-8");
//         获取一个输出对象
        PrintWriter out = response.getWriter();//注意这里穿件out对象是不可以用new关键词。
//         打印表单
        out.println(
                "<form action='CheckServlet' method='get'>" +
                        "用户名<input type='text' name='username'/><br/>" +
                        "密　码<input type='password' name='password'/><br/>" +
                        "<button type='submit'>提交</button>" + "</form>"
        );
    }
    //当你使用post提交的时候在另一个页面是无法显示出来的，只有get才可以显示

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

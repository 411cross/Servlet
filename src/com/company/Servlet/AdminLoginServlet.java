package com.company.Servlet;

import com.company.Service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/29.
 */
public class AdminLoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String id = (String) req.getParameter("id");
        String password =(String) req.getParameter("password");

        if(LoginService.administratorLogin(id,password)){
            System.out.println("{\"StatueCode\":\"200\",\"Message\":\"成功\"}");
        }else{

        }

    }
}

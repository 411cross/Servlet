package com.company.Servlet;

import com.company.Entity.User;
import com.company.Service.LoginService;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by derrickJ on 2017/6/30.
 */
public class GetOrderServlet extends HttpServlet {

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//
//        String id =req.getParameter("id");
//        String name = req.getParameter("name");
//        String password = req.getParameter("password");
//
//        User user = new User(id,password,name);
//
//        if(LoginService.userLogin(user)){
//            System.out.println("{\"StatueCode\":\"200\",\"Message\":\"成功\"}");
//
//        }else{
//
//        }
//
//    }

}

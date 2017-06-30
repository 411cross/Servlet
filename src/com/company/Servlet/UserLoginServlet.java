package com.company.Servlet;

/**
 * Created by Administrator on 2017/6/29.
 */
import com.company.Entity.User;
import com.company.Service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        String id =req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        User user = new User(id,password,name);
        StringBuffer stringBuffer = new StringBuffer();
        if(LoginService.userLogin(user)){

            stringBuffer.append("{'message':[{'code':'200','str':'登录成功'}]}");    //生成User的JSON 格式

        }else{
            stringBuffer.append("{'message':[{'code':'100','str':'登录失败'}]}");

        }
        resp.getOutputStream().write(stringBuffer.toString().getBytes("GBK"));




    }
}

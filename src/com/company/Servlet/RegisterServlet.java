package com.company.Servlet;

import com.company.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/6/30.
 */
public class RegisterServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String id = (String) req.getParameter("id");
        String pass = (String)req.getParameter("pass");
        String name = (String)req.getParameter("name");

        StringBuffer stringBuffer = new StringBuffer();
        try {
            if(UserService.register(id,name,pass)){
                stringBuffer.append("{'message':[{'code':'200','str':'登录成功'}]}");
            }else{
                stringBuffer.append("{'message':[{'code':'100','str':'登录失败'}]}");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.getOutputStream().write(stringBuffer.toString().getBytes("GBK"));
    }
}

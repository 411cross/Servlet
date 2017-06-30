package com.company.Servlet;

import com.company.Service.FilterNurseService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/6/29.
 */
public class FilterNurseServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        int filter = Integer.parseInt(req.getParameter("filter"));
        int position = Integer.parseInt(req.getParameter("position"));
        try {
            FilterNurseService.filterNurse(filter,position);
        } catch (SQLException e) {
            e.printStackTrace();
        }

//  //先转JSON 格式
//
//        StringBuffer stringBuffer = new StringBuffer();
//
//        if(new LoginService().login(user)){
//
//            stringBuffer.append("{'message':[{'code':'200','str':'登录成功'}]}");
//        }else{
//            stringBuffer.append("{'message':[{'code':'100','str':'登录失败'}]}");
//
//        }
//
//        response.getOutputStream().write(stringBuffer.toString().getBytes("GBK"));


    }
}

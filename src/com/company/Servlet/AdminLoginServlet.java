package com.company.Servlet;

import com.company.Service.GeneralService;
import com.company.Service.LoginService;
import net.sf.json.JSONObject;

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

        JSONObject jsonObject = GeneralService.toJsonObject(req);
        int id = jsonObject.getInt("id");
        String password = jsonObject.getString("password");

        StringBuffer stringBuffer = new StringBuffer();

        if(LoginService.administratorLogin(id,password)){
            resp.setStatus(200);
            stringBuffer.append("{\"statueCode\":\"200\",\"message\":\"成功\"}");
        } else {
            resp.setStatus(100);
            stringBuffer.append("{\"statueCode\":\"100\",\"message\":\"失败\"}");
        }

        resp.getOutputStream().write(stringBuffer.toString().getBytes("GBK"));

    }
}

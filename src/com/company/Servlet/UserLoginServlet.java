package com.company.Servlet;

/**
 * Created by Administrator on 2017/6/29.
 */
import com.company.Entity.User;
import com.company.Service.GeneralService;
import com.company.Service.LoginService;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        JSONObject jsonObject = GeneralService.toJsonObject(req);
        String id = jsonObject.getString("id");
        String password = jsonObject.getString("password");

        StringBuffer stringBuffer = new StringBuffer();

        if(LoginService.userLogin(id, password)){

            stringBuffer.append("{'message':[{'code':'200','str':'登录成功'}]}");    //生成User的JSON 格式

        }else{
            stringBuffer.append("{'message':[{'code':'100','str':'登录失败'}]}");

        }
        resp.getOutputStream().write(stringBuffer.toString().getBytes("GBK"));

    }

}

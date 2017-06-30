package com.company.Servlet;

import com.company.Entity.Nurse;
import com.company.Entity.Order;
import com.company.Entity.User;
import com.company.Service.GeneralService;
import com.company.Service.LoginService;
import com.company.Service.NurseService;
import com.company.Service.OrderService;
import com.google.gson.Gson;
import net.sf.json.JSONObject;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by derrickJ on 2017/6/30.
 */
public class GetOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doPost(req, resp);

        Gson gson = new Gson();
        ArrayList<Order> orderList = new ArrayList<>();

        JSONObject jsonObject = GeneralService.toJsonObject(req);
        String userId = jsonObject.getString("id");
        int orderSituation = jsonObject.getInt("situation");

        try {
            orderList = OrderService.getOrder(userId, orderSituation);
            resp.setStatus(200);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String jsonString = gson.toJson(orderList);
        String response = "{\"statueCode\":\"200\",\"data\":" + jsonString + "}";

        resp.getOutputStream().write(response.getBytes("GBK"));

    }

}

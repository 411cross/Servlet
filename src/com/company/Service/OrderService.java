package com.company.Service;

import com.company.DAO.DBconnect;
import com.company.Entity.Nurse;
import com.company.Entity.Order;
import com.company.Entity.Patient;
import com.company.Entity.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by derrickJ on 2017/6/29.
 */
public class OrderService {

    static public ArrayList<Order> getOrder(String userId, int orderSituation) throws SQLException {

        boolean flag = false;
        ArrayList<Order> orderList = new ArrayList<>();
        Order tempOrder = new Order();
        User tempUser;
        Nurse tempNurse;
        Patient tempPatient;

        Connection conn = DBconnect.getConn();

        PreparedStatement prestate;

        String sql = "select * from app_order where u_id =?  and situtation = ?";

        prestate = conn.prepareStatement(sql);

        prestate.setString(1, userId);
        prestate.setInt(2, orderSituation);

        ResultSet result = prestate.executeQuery();

        while (result.next()) {

            int id = result.getInt("id");
            int totalPrice = result.getInt("total_price");
            String createTime = result.getString("create_time");
            String serviceTime = result.getString("service_time");
            int type = result.getInt("type");
            int situation = result.getInt("situation");
            int choseNurse = result.getInt("chose_nurse");
            int nurseID = result.getInt("n_id");
            int patientID = result.getInt("p_id");

            tempUser = GeneralService.getUser(userId);
            tempNurse = GeneralService.getNurse(nurseID);
            tempPatient = GeneralService.getPatient(patientID);

            tempOrder.setId(id);
            tempOrder.setTotalPrice(totalPrice);
            tempOrder.setCreateTime(createTime);
            tempOrder.setServiceTime(serviceTime);
            tempOrder.setType(type);
            tempOrder.setSituation(situation);
            tempOrder.setChoseNurse(choseNurse);
            tempOrder.setUser(tempUser);
            tempOrder.setNurse(tempNurse);
            tempOrder.setPatient(tempPatient);

            orderList.add(tempOrder);

            System.out.println("ORDER ID IS:" + tempOrder.getId());

        }

        return orderList;
    }

}

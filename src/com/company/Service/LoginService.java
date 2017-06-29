package com.company.Service;

import com.company.DAO.DBconnect;
import com.company.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Administrator on 2017/6/29.
 */
public class LoginService {
//    public boolean login(User user){
//        boolean flag = false;
//
//        Connection conn = DBconnect.getConn();
//
//        PreparedStatement prestate;
//
//        String sql = "select * from app_user where username =  and password = ?";
//        try{
//            prestate = conn.prepareStatement(sql);
//
//            prestate.setString(1, user.getUsername());
//            prestate.setString(2, user.getPass());
//
//            ResultSet result = prestate.executeQuery();
//
//            while(result.next()){
//                String username = result.getString(1);
//
//                System.out.println("username is "+username);
//
//                flag = true;
//            }
//
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//
//        return flag;
//    }
}

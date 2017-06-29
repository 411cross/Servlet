package com.company.Service;

import com.company.DAO.DBconnect;
import com.company.Entity.Administrator;
import com.company.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Administrator on 2017/6/29.
 */
public class LoginService {
    static public boolean userLogin(User user){
        boolean flag = false;

        Connection conn = DBconnect.getConn();

        PreparedStatement prestate;

        String sql = "select * from app_user where id =?  and password = ?";
        try{
            prestate = conn.prepareStatement(sql);

            prestate.setString(1, user.getId());
            prestate.setString(2, user.getPassword());

            ResultSet result = prestate.executeQuery();

            while(result.next()){
//                String username = result.getString(3);

                System.out.println("登录成功！");

                flag = true;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

        return flag;
    }


    static public boolean administratorLogin(String id ,String password){
        boolean flag = false;
        Connection conn = DBconnect.getConn();

        PreparedStatement prestate;

        String sql = "select * from app_administrator where id =?  and password = ?";

        try{
            prestate = conn.prepareStatement(sql);

            prestate.setString(1, id);
            prestate.setString(2, password);

            ResultSet result = prestate.executeQuery();

            while(result.next()){
                System.out.println("登录成功！");

                flag = true;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

        return flag;



    }


}

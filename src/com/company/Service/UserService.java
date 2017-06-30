package com.company.Service;

import com.company.DAO.DBconnect;
import com.company.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/6/30.
 */
public class UserService {

    /*
    * 登录
    * */

    static public boolean register(String id ,String name,String pass) throws SQLException {
        boolean flag = false;
        Connection conn = DBconnect.getConn();

        PreparedStatement prestate;

        String sql = "insert into app_user(id,password,name) values(?,?,?)";
        prestate = (PreparedStatement) conn.prepareStatement(sql);
        prestate.setString(1, id);
        prestate.setString(2, pass);
        prestate.setString(3, name);

        int i = prestate.executeUpdate();   //返回更新数目的条数
        if(i == 1) flag = true;
        else flag =false;

        return flag;
    }

    /*用户修改个人信息*/

    static  public boolean modifyUserInfomation(User user) throws SQLException {


        boolean flag = false;
        Connection conn = DBconnect.getConn();

        PreparedStatement prestate;

        String sql = "update app_user set passord=?,name=?,avatar=? where id =?";
        prestate = (PreparedStatement) conn.prepareStatement(sql);
        prestate.setString(1, user.getPassword());
        prestate.setString(2, user.getName());
        prestate.setString(3, user.getAvatar());
        prestate.setString(4, user.getId());

        int i = prestate.executeUpdate();   //返回更新数目的条数
        if(i == 1) flag = true;
        else flag =false;

        return flag;


    }

}

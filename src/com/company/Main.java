package com.company;

import com.company.DAO.DBconnect;
import com.company.Service.GeneralService;
import com.sun.tools.javac.jvm.Gen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Connection conn = DBconnect.getConn();
//		    int i = 0;
//		    String sql = "insert into students (Name,Sex,Age) values(?,?,?)";

        String sql = "select * from app_user;";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);


            ResultSet result = pstmt.executeQuery();

            while(result.next()){
                System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
            }


//		        pstmt.setString(1, student.getName());
//		        pstmt.setString(2, student.getSex());
//		        pstmt.setString(3, student.getAge());
//		        i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        GeneralService.getNurse(1);
        GeneralService.getPatient(2);
        GeneralService.getUser("15515515515");


    }
}

package com.company.Service;

import com.company.DAO.DBconnect;
import com.company.Entity.Nurse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/29.
 */
public class NurseService {
    static  public ArrayList<Nurse> filterNurse(int filter, int position) throws SQLException {

        ArrayList<Nurse> NurseList = new ArrayList<Nurse>();


        Connection conn = DBconnect.getConn();

        PreparedStatement prestate;

        switch(filter){
            case 1:
                  String sql = "select n_id from app_range where type =? ";

                    prestate = conn.prepareStatement(sql);

                    prestate.setInt(1, position);

                    ResultSet result = prestate.executeQuery();

                    while(result.next()) {
                       NurseList.add(GeneralService.getNurse(result.getInt("n_id")));
                    }
                    break;
            case 2:switch (position){
                case 1: String sql1 = "select id from app_nurse where work_age<=3 and work>=1 ";
                    prestate = conn.prepareStatement(sql1);
                    ResultSet result1 = prestate.executeQuery();
                    while(result1.next()) {
                        NurseList.add(GeneralService.getNurse(result1.getInt("n_id")));
                    }
                    break;
                case 2: String sql2 = "select id from app_nurse where work_age<=6 and work>=4 ";
                    prestate = conn.prepareStatement(sql2);
                    ResultSet result2 = prestate.executeQuery();
                    while(result2.next()) {
                        NurseList.add(GeneralService.getNurse(result2.getInt("n_id")));
                    }
                    break;
                case 3: String sql3 = "select id from app_nurse where work_age<=9 and work>=7 ";
                    prestate = conn.prepareStatement(sql3);
                    ResultSet result3 = prestate.executeQuery();
                    while(result3.next()) {
                        NurseList.add(GeneralService.getNurse(result3.getInt("n_id")));
                    }
                    break;
                case 4: String sql4 = "select id from app_nurse where work_age>=10 ";
                    prestate = conn.prepareStatement(sql4);
                    ResultSet result4 = prestate.executeQuery();
                    while(result4.next()) {
                        NurseList.add(GeneralService.getNurse(result4.getInt("n_id")));
                    }
                    break;
            }
            break;
            case 3: String sql5 = "select id from app_nurse where sex= ?  ";
                    prestate = conn.prepareStatement(sql5);
                    prestate.setInt(1, position-1);    ///看位置是不是正确
                    ResultSet result5 = prestate.executeQuery();
                    while(result5.next()) {
                        NurseList.add(GeneralService.getNurse(result5.getInt("n_id")));
                    }
                    break;
            case 4: switch (position){
                case 1:String sql6 = "select id from app_nurse where evaluation<60 and work>=0 ";
                    prestate = conn.prepareStatement(sql6);
                    ResultSet result6 = prestate.executeQuery();
                    while(result6.next()) {
                        NurseList.add(GeneralService.getNurse(result6.getInt("n_id")));
                    }
                    break;
                case 2:String sql7 = "select id from app_nurse where evaluation<70 and work>=60 ";
                    prestate = conn.prepareStatement(sql7);
                    ResultSet result7 = prestate.executeQuery();
                    while(result7.next()) {
                        NurseList.add(GeneralService.getNurse(result7.getInt("n_id")));
                    }
                    break;
                case 3:String sql8 = "select id from app_nurse where evaluation<80 and work>=70 ";
                    prestate = conn.prepareStatement(sql8);
                    ResultSet result8 = prestate.executeQuery();
                    while(result8.next()) {
                        NurseList.add(GeneralService.getNurse(result8.getInt("n_id")));
                    }
                    break;
                case 4:String sql9 = "select id from app_nurse where evaluation<90 and work>=80 ";
                    prestate = conn.prepareStatement(sql9);
                    ResultSet result9 = prestate.executeQuery();
                    while(result9.next()) {
                        NurseList.add(GeneralService.getNurse(result9.getInt("n_id")));
                    }
                    break;
                case 5:String sql10 = "select id from app_nurse where evaluation<=100 and work>=90 ";
                    prestate = conn.prepareStatement(sql10);
                    ResultSet result10 = prestate.executeQuery();
                    while(result10.next()) {
                        NurseList.add(GeneralService.getNurse(result10.getInt("n_id")));
                    }
                    break;
            }

            }

            return NurseList;
        }

        /*管理员增加护工
        *
        * */

        static  public void addNurse(Nurse nurse){
            Connection conn = DBconnect.getConn();

            PreparedStatement prestate;

            String sql = "insert into";

        }

    }

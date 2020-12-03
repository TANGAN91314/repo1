package com.stu.dao;

import com.stu.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDaoImp implements StudentDao {

    //要通过jdbc去访问数据库

    @Override
    public List<Student> selectStudent(String sql) throws ClassNotFoundException {
        List<Student> list =new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC\n";
        String user = "root";
        String password = "password";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Integer sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                Integer age = rs.getInt("age");
                String sgender = rs.getString("sgender");
                Date enterdate = rs.getDate("enterdate");
                Integer cid = rs.getInt("cid");
                Double score = rs.getDouble("score");
                Student student = new Student(sid,sname,age,sgender,enterdate,cid,score);
                list.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                conn = null;
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                pstmt = null;
            }
            return list;
        }
    }
}

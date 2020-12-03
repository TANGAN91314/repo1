package com.stu.dao;

import com.stu.entity.Student;

import java.util.List;

/*
* 访问数据库的接口
* 对数据库的基本操作
* */
public interface StudentDao {
    /*
    * 根据sql语句查询所有学生
    * */
    List<Student> selectStudent(String sql) throws ClassNotFoundException;
}

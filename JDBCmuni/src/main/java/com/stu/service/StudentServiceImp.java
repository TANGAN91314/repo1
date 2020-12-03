package com.stu.service;

import com.stu.dao.StudentDao;
import com.stu.dao.StudentDaoImp;
import com.stu.entity.Student;

import java.util.List;


/*
* 业务逻辑的具体实现类，所有对学生操作业务的
* */
public class StudentServiceImp implements StudentService {
    //通过dao层去访问数据库，并得到返回的结果
    private final StudentDao dao = new StudentDaoImp();
    /*
    * 查询所有的学生
    * */

    @Override
    public List<Student> selectAll() throws ClassNotFoundException {
        String sql = "select * from student";
        return dao.selectStudent(sql);
    }
}

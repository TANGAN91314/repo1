package com.stu.service;
import com.stu.entity.Student;

import java.util.List;
/*
* 学生管理系统的业务逻辑
*/

public interface StudentService {
    List<Student> selectAll() throws ClassNotFoundException;

}

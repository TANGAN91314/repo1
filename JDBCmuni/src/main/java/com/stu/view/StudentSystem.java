package com.stu.view;

import com.stu.entity.Student;
import com.stu.service.StudentService;
import com.stu.service.StudentServiceImp;

import java.util.List;
import java.util.Scanner;
/*
* 视图层
* 控制台内容的显示，以及学生各种操作和控制台的交互
* */


public class StudentSystem {
    /*
     * 用于接受键盘输入的扫描器
     */
    private StudentService service = new StudentServiceImp();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("*************欢迎来到淦淦学生管理系统*************");
    }

    public void exit() {
        System.out.println("*************成功退出！谢谢使用！**************");
        System.exit(0);
    }

    /*显示菜单
     * 1：查看所有
     * 2：添加学生
     * 3：删除学生
     * 4：修改学生
     * 5：查找学生  2级菜单 根据学号查找，跟据姓名查找
     * 6：退出系统
     * */
    public void menu() {
        System.out.println("*********");
        System.out.println("1:查看所有");
        System.out.println("2:添加学生");
        System.out.println("3:删除学生");
        System.out.println("4:修改学生");
        System.out.println("5:查找学生");
        System.out.println("6:退出系统");
        System.out.println("*********");
    }

    //选择菜单
    public int selectMenu() {
        System.out.println("请输入要选择的操作：");
        return sc.nextInt();
    }

    //查询所有学生的信息
    public void selectAll() throws ClassNotFoundException {
        List<Student> stus = service.selectAll();
        //需要在界面层展示
        System.out.println("**************所有学生的信息**************");
        if (stus == null || stus.size() == 0) {
            System.out.println("没有学生信息");
        } else {
            for (Student student : stus) {
                System.out.println(student);
            }
        }
    }
}

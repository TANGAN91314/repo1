package com.stu.app;
/*
 * 系统入口类
 */


import com.stu.view.StudentSystem;

import java.io.Serializable;
import java.util.Date;

public class StudentSystemApp{
    public static void main(String[] args) throws ClassNotFoundException {
        //定义菜单选项的常量
        final int SELECT_ALL = 1;
        final int ADD_STUDENT = 2;
        final int DEL_STUDENT = 3;
        final int UPD_STUDENT = 4;
        final int SEL_STUDENT = 5;
        final int EXIT = 6;

        StudentSystem system = new StudentSystem();
        //启动系统
        system.start();
        while (true){
        //展示菜单
        system.menu();
        //选择菜单
        int index = system.selectMenu();
        switch (index) {
            case SELECT_ALL:
                system.selectAll();
                break;
            case ADD_STUDENT:
                break;
            case DEL_STUDENT:
                break;
            case UPD_STUDENT:
                break;
            case SEL_STUDENT:
                break;
            case EXIT:
                system.exit();
                break;
            }
        }
    }
}

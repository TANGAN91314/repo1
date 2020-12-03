package com.stu.entity;

import java.io.Serializable;
import java.util.Date;

//学生的字段：学号，姓名，年龄，性别，入学日期，班级编号，分数。
public class Student implements Serializable {
    //定义一个serialVersionUID常量
    private static final long serialVersionUID = 1L;
    private Integer sid;
    private String sname;
    private Integer age;
    private String sgender;
    private Date enterdate;
    private Integer cid;
    private Double score;

    public Student() {
    }

    public Student(Integer sid, String sname, Integer age, String sgender, Date enterdate, Integer cid, Double score) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.sgender = sgender;
        this.enterdate = enterdate;
        this.cid = cid;
        this.score = score;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}


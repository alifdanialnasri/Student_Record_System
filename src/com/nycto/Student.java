package com.nycto;

public class Student {

    public String Studentname;
    public String Studentid;

    public Student(String id, String name) {
        Studentname = name;
        Studentid = id;

    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public String getStudentid() {
        return Studentid;
    }

    public void setStudentid(String studentid) {
        Studentid = studentid;
    }
}


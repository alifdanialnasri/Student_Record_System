package com.nycto;

public class Course {
    //variable decalartion
    public String coursename;
    public String courseprice;

    //Course constructor
    public Course(String name,String price)
    {
        coursename = name;
        courseprice = price;

    }

    //setter and getter
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(String courseprice) {
        this.courseprice = courseprice;
    }
}



package com.hfad.androidclasss2.com.model;

/**
 * Created by user on 8/13/2016.
 */
public class Student {
    public Student(String stuname,String grade,String id, String contact ){
        this.stuname=stuname;
        this.grade=grade;
        this.id=id;
        this.contact=contact;

    }
    String stuname;
    String grade;

    public String getStuName() {
        return stuname;
    }

    public void setName(String name) {
        this.stuname = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    String id;
    String contact;
}

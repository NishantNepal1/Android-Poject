package com.hfad.androidclasss2.com.model;

/**
 * Created by user on 8/14/2016.
 */
public class Course {
    public Course(String course,String duration){
        this.course=course;
        this.duration=duration;


    }
    String duration;
    String course;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

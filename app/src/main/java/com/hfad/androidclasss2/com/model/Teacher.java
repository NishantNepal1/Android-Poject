package com.hfad.androidclasss2.com.model;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by user on 8/12/2016.
 */
public class Teacher {
    public Teacher(String name, String faculty, String contact/*ImageView image*/){
        this.name=name;
        this.faculty=faculty;
        this.contact=contact;
        /*this.image=image;*/
    }
    /*ImageView image;
    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }*/

    String name;

    String faculty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    String contact;
}

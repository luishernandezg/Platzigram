package com.example.luishernandez.platzigram.model;

/**
 * Created by luis on 02/01/2018.
 */

public class Picture {
    private String userName;
    private String picture;
    private String time;
    private String likeNumber;

    public Picture(String userName, String picture, String time, String likeNumber) {
        this.userName = userName;
        this.picture = picture;
        this.time = time;
        this.likeNumber = likeNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(String likeNumber) {
        this.likeNumber = likeNumber;
    }
}

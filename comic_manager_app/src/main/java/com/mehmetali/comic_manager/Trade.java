package com.mehmetali.comic_manager;


import java.io.Serializable;

@SuppressWarnings("serial")
public class Trade implements Serializable {
    private int comicID;
    private String title;
    private int pageNumber;
    private String user;
    private int value;

    // Constructor
    public Trade(int comicID, String title, int pageNumber, String user, String coverArt, int value) {
        this.comicID = comicID;
        this.title = title;
        this.pageNumber = pageNumber;
        this.user = user;
        this.value = value;
    }

    // Getters and setters
    public int getComicID() {
        return comicID;
    }

    public void setComicID(int comicID) {
        this.comicID = comicID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getpageNumber() {
        return pageNumber;
    }

    public void setpageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // toString method for printing comic details
    @Override
    public String toString() {
        return "Comic{" +
                "comicID=" + comicID +
                ", title='" + title + '\'' +
                ", pageNumber=" + pageNumber +
                ", user='" + user + '\'' +
                ", value=" + value +
                '}';
    }
}
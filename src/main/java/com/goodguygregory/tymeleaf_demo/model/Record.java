package com.goodguygregory.tymeleaf_demo.model;


public class Record {
    private String title;
    private String artist;

    public Record(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Record(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}

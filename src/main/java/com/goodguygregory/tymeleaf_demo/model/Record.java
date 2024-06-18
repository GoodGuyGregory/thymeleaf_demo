package com.goodguygregory.tymeleaf_demo.model;


public class Record {
    private String title;
    private String artist;
    private String genre;
    private String methodAquired;

    public Record(String title, String artist, String genre, String methodAquired) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.methodAquired = methodAquired;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMethodAquired() {
        return methodAquired;
    }

    public void setMethodAquired(String methodAquired) {
        this.methodAquired = methodAquired;
    }


}

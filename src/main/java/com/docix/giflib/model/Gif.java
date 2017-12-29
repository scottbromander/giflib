package com.docix.giflib.model;

import java.time.LocalDate;

public class Gif {

    private String name;
    private LocalDate dateUploaded;
    private String userName;
    private Boolean favorite;

    public Gif(String name, LocalDate dateUploaded, String userName, Boolean favorite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}

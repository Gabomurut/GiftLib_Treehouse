package com.treehouse.giftlib.model;

import java.time.LocalDate;

public class Gif {
        private String name;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private int categoryId;
        private LocalDate dateUploaded;
        private String user;
        private boolean favorite;

    public Gif(String name, int categoryId ,LocalDate dateUploaded, String user, boolean favorite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


}
package com.example.josan.recyclerviewexample.Model;


public class Anime {
    private String name;
    private String releaseDate;
    private String episodes;

    public Anime(String name, String releaseDate, String episodes) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setViews(String views) {
        this.episodes = views;
    }
}

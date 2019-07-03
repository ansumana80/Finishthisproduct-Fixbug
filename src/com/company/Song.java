package com.company;

public class Song
{
    private String artist;
    private String title;


    public Song()
    {
        System.out.println("The Constructor has run");
    }

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String display(){
        return getArtist() + " : " + getTitle();}

    @Override
    public String toString() {
        return "com.company.Song{" +
                "Artist Name='" + artist + '\'' +
                ", Title Name='" + title + '\'' +
                '}';
    }
}

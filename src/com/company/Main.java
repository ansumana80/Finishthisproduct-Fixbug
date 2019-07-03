package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i <1; i++) {
            System.out.println("Please enter a name of an artist: ");
            String artist = keyboard.nextLine();
            System.out.println("Please enter the title of artist's song: ");
            String title = keyboard.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);

        }
        //print all the songs in the array list
        for (Song s : songs) {
            System.out.println(s.toString());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song xxxx : songs) {
            if (xxxx.getTitle().equals(titleToFind)) {
                System.out.printf("I found %s \r\n", xxxx.display());
            }
        }
    }
}
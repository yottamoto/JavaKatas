package com.blackandwhat;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by cca on 11.05.2016.
 */
public class PlayMp3 {

    private String filename;
    // player library retrieved from http://www.javazoom.net/javalayer/sources.html
    private Player player;

    // constructor that takes the name of an MP3 file
    public PlayMp3(String filename) {
        this.filename = filename;
    }

    public void close() {
        if (player != null) player.close();
    }

    // play the MP3 file to the sound card
    public void play() {
        try {
            FileInputStream fis     = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }
    }


    // test client
    public static void main(String[] args) {
        String filename = args[0];
        PlayMp3 mp3 = new PlayMp3(filename);
        mp3.play();

    }

}

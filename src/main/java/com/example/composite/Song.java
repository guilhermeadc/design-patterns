package com.example.composite;

public class Song implements IComponent {

    private String songName;
    private String artist;
    private float speed;

    @Override
    public void play() {
        // play song
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    public double getPlaybackSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        // get name of song
        return this.songName;
    }

}

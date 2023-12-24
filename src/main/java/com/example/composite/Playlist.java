package com.example.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

    private String playlistName;
    private ArrayList<IComponent> playlist = new ArrayList<IComponent>();

    @Override
    public void play() {
        this.playlist.forEach(component -> component.play());
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.playlist.forEach(component -> component.setPlaybackSpeed(speed));
    }

    @Override
    public String getName() {
        // get name of playlist
        return this.playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }
}

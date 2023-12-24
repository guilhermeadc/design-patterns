package com.example.composite;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class PlaylistTest {

    private Playlist playlist;
    private IComponent component;

    @Before
    public void setUp() {
        playlist = new Playlist();
        component = mock(IComponent.class);
        playlist.add(component);
    }

    @Test
    public void testPlay() {
        playlist.play();
        verify(component, times(1)).play();
    }

    @Test
    public void testSetPlaybackSpeed() {
        float expectedSpeed = 1.5f;
        playlist.setPlaybackSpeed(expectedSpeed);
        verify(component, times(1)).setPlaybackSpeed(expectedSpeed);
    }

    @Test
    public void testAdd() {
        IComponent newComponent = mock(IComponent.class);
        playlist.add(newComponent);
        playlist.play();
        verify(newComponent, times(1)).play();
    }

    @Test
    public void testRemove() {
        playlist.remove(component);
        playlist.play();
        verify(component, times(0)).play();
    }
}
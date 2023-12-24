package com.example.composite;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SongTest {

    private Song song;

    @Before
    public void setUp() {
        song = new Song();
    }

    @Test
    public void testSetPlaybackSpeed() {
        float expectedSpeed = 1.5f;
        song.setPlaybackSpeed(expectedSpeed);
        assertEquals(expectedSpeed, song.getPlaybackSpeed(), 0.01);
    }
}
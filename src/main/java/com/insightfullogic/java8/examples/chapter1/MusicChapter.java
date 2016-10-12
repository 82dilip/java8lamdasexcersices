/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.insightfullogic.java8.examples.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard Warburton
 */
public abstract class MusicChapter {
    
    protected final List<Artist> artists;
    protected final List<Album> albums;

    public MusicChapter() {
        artists = new ArrayList<>();
        albums = new ArrayList<>();
        loadData("");
    }

    private void loadData(String file) {
        artists.add(SampleData.johnColtrane);
        artists.add(SampleData.georgeHarrison);
        artists.add(SampleData.johnLennon);
        artists.add(SampleData.paulMcCartney);
        artists.add(SampleData.ringoStarr);
        artists.add(SampleData.theBeatles);
        
        albums.add(SampleData.aLoveSupreme);
        albums.add(SampleData.manyTrackAlbum);
        albums.add(SampleData.sampleShortAlbum);
        
    }
    
}

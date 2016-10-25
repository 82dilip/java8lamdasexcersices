package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {

	public int externalCountArtistsFromLondon(List<Artist> allArtists) {
		// BEGIN external_count_londoners
		int count = 0;
		for (Artist artist : allArtists) {
			if (artist.isFrom("UK")) {
				count++;
			}
		}
		// END external_count_londoners
		return count;
	}

    public int externalCountArtistsFromLondonExpanded(List<Artist> allArtists) {
		// BEGIN external_count_londoners_expanded
		int count = 0;
		Iterator<Artist> iterator = allArtists.iterator();
		while (iterator.hasNext()) {
			Artist artist = iterator.next();
			if (artist.isFrom("US")) {
				count++;
			}
		}
		// END external_count_londoners_expanded
		return count;
	}


    public long internalCountArtistsFromLondon(List<Artist> allArtists) {
		// BEGIN internal_count_londoners
		long count = allArtists.stream().filter(artist -> artist.isFrom("UK")).count();
		// END internal_count_londoners
		return count;
    }

	public void filterArtistsFromLondon(List<Artist> allArtists) {
		// BEGIN filter_londoners
		allArtists.stream().filter(artist -> artist.isFrom("London"));
		// END filter_londoners
	}

    public void filterArtistsFromLondonPrinted(List<Artist> allArtists) {
        // BEGIN filter_londoners_printed
		allArtists.stream().filter(artist -> {
			System.out.println(artist.getNationality());
			System.out.println(artist.getName());
			return artist.isFrom("UK");
          });
        // END filter_londoners_printed
    }

    public long internalCountArtistsFromLondonPrinted(List<Artist> allArtists) {
        // BEGIN internal_count_londoners_printed
        long count = allArtists.stream()
                       .filter(artist -> {
                           System.out.println(artist.getName());
                           return artist.isFrom("UK");
                       })
                       .count();
        // END internal_count_londoners_printed
        
        return count;
    }

    
    public static void main(String[] args) {
	/*	List<Artist> artists = new ArrayList<>();
		artists.add(SampleData.johnColtrane);
		artists.add(SampleData.georgeHarrison);
		artists.add(SampleData.johnLennon);
		artists.add(SampleData.paulMcCartney);
		artists.add(SampleData.ringoStarr);
		artists.add(SampleData.theBeatles);*/
    	
    	List<Artist> artists = SampleData.getThreeArtists();
		
		Iteration iteration = new Iteration();
		/*System.out.println(iteration.externalCountArtistsFromLondon(artists));
		System.out.println(iteration.externalCountArtistsFromLondonExpanded(artists));
		System.out.println(iteration.internalCountArtistsFromLondon(artists));
		iteration.filterArtistsFromLondon(artists);*/
		
		
		iteration.filterArtistsFromLondonPrinted(artists);
		System.out.println(iteration.internalCountArtistsFromLondonPrinted(artists));
	}
}

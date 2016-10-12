/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.insightfullogic.java8.examples.chapter1;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author richard
 */
public class Chapter1 extends MusicChapter {

    public List<String> getNamesOfArtists_Lambda() {
        return artists.stream()
                      .map(artist -> artist.getName())
                      .collect(Collectors.toList());
    }
    
    public List<String> getNamesOfArtists_MethodReference() {
        return artists.stream()
                      .map(Artist::getName)
                      .collect(Collectors.toList());
    }
    
    public List<Artist> artistsLivingInLondon() {
        return (List<Artist>) artists.stream()
                      .filter(                  	  
                    	  artist -> {
                    		  //System.out.println(artists.toString());
                    		  return "UK".equals(artist.getNationality());
                    	  })
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {
		System.out.println(new Chapter1().getNamesOfArtists_Lambda());
		//System.out.println(new Chapter1().getNamesOfArtists_MethodReference());
		System.out.println(new Chapter1().artistsLivingInLondon());
		
	}
}

package testVagrant;

import java.util.LinkedList;

public class Playlist 
{
	    public static void main(String[] args) 
	    {
	        // Initialize the playlist with an initial capacity of 3
	        String[] playlist = new String[3];
	        
	        // Play S1, S2, S3
	        playlist[0] = "S1";
	        playlist[1] = "S2";
	        playlist[2] = "S3";
	        
	        // Assert initial playlist
	        assert playlist[0].equals("S1");
	        assert playlist[1].equals("S2");
	        assert playlist[2].equals("S3");
	        
	        // Play S4
	        playlist[0] = "S4";
	        
	        // Assert playlist after playing S4
	        assert playlist[0].equals("S4");
	        assert playlist[1].equals("S2");
	        assert playlist[2].equals("S3");
	        
	        // Play S2
	        String temp = playlist[1];
	        playlist[1] = playlist[2];
	        playlist[2] = playlist[0];
	        playlist[0] = temp;
	        
	        // Assert playlist after playing S2
	        assert playlist[0].equals("S2");
	        assert playlist[1].equals("S3");
	        assert playlist[2].equals("S4");
	        
	        // Play S1
	        temp = playlist[0];
	        playlist[0] = playlist[1];
	        playlist[1] = playlist[2];
	        playlist[2] = temp;
	        
	        // Assert playlist after playing S1
	        assert playlist[0].equals("S3");
	        assert playlist[1].equals("S4");
	        assert playlist[2].equals("S2");
	        
	        System.out.println("All assertions passed.");
	    }
	}

